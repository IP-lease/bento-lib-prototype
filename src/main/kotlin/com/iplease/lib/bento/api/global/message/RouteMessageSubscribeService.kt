package com.iplease.lib.bento.api.global.message

import com.iplease.lib.bento.api.global.subscribe.MessageSubscriber

abstract class RouteMessageSubscribeService: MessageSubscribeService {
    final override fun subscribe(message: Message) { getSubscribers().forEach { it.subscribe(message) } }
    abstract fun getSubscribers(): Iterable<MessageSubscriber>
}