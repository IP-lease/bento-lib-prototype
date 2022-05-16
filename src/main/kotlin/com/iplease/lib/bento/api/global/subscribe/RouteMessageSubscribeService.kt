package com.iplease.lib.bento.api.global.subscribe

import com.iplease.lib.bento.api.global.listener.MessageListener
import com.iplease.lib.bento.api.global.message.Message

abstract class RouteMessageSubscribeService: MessageSubscribeService {
    final override fun subscribe(message: Message) { getListeners().forEach { it.subscribe(message) } }
    abstract fun getListeners(): Iterable<MessageListener>
}