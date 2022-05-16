package com.iplease.lib.bento.api.global.message

import com.iplease.lib.bento.api.global.listener.MessageListener

abstract class RouteMessageSubscribeService: MessageSubscribeService {
    final override fun subscribe(message: Message) { getSubscribers().forEach { it.subscribe(message) } }
    abstract fun getSubscribers(): Iterable<MessageListener>
}