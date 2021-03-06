package com.iplease.lib.bento.impl.error.listener

import com.iplease.lib.bento.api.error.ErrorPayload
import com.iplease.lib.bento.util.ErrorTypes
import com.iplease.lib.bento.api.common.message.Message
import com.iplease.lib.bento.api.common.listener.MessageListener
import reactor.core.publisher.Mono
import kotlin.reflect.KClass
import kotlin.reflect.cast

abstract class ReactiveErrorMessageListener<T: ErrorPayload> (
    private val type: KClass<T>
): MessageListener {
    private val error = ErrorTypes.of(type)

    override fun subscribe(data: Message) {
        if(data.getRoutingKey() != error.getRoutingKey()) return
        parse(data)
            .map { type.cast(it) }
            .let { handle(it) }
            .map {  }
            .onErrorReturn(Unit)
            .block()
    }

    abstract fun parse(message: Message): Mono<T>
    abstract fun handle(it: Mono<T>): Mono<*>
}