package com.iplease.lib.bento.error.subscribe

import com.iplease.lib.bento.error.data.ErrorData
import com.iplease.lib.bento.error.type.ErrorTypes
import com.iplease.lib.bento.global.message.Message
import com.iplease.lib.bento.global.subscribe.MessageSubscriber
import reactor.core.publisher.Mono
import kotlin.reflect.KClass
import kotlin.reflect.cast

abstract class ReactiveErrorMessageSubscriber<T: ErrorData> (
    private val type: KClass<T>
): MessageSubscriber {
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