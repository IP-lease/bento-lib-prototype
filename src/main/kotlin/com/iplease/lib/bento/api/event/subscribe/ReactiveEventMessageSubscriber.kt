package com.iplease.lib.bento.api.event.subscribe

import com.iplease.lib.bento.api.global.message.Message
import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.event.type.EventTypes
import com.iplease.lib.bento.api.global.subscribe.MessageSubscriber
import reactor.core.publisher.Mono
import kotlin.reflect.KClass
import kotlin.reflect.cast

abstract class ReactiveEventMessageSubscriber<T: EventData> (
    private val type: KClass<T>
): MessageSubscriber {
    private val event = EventTypes.of(type)

    override fun subscribe(data: Message) {
        if(data.getRoutingKey() != event.getRoutingKey()) return
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