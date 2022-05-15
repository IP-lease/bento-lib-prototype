package com.iplease.lib.bento.subscribe

import com.iplease.lib.bento.message.Message
import com.iplease.lib.bento.data.EventData
import com.iplease.lib.bento.type.EventTypes
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