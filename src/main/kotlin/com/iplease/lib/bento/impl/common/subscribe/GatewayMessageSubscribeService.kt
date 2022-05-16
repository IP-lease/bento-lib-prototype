package com.iplease.lib.bento.impl.common.subscribe

import com.iplease.lib.bento.api.common.listener.MessageListener
import com.iplease.lib.bento.api.common.message.Message
import com.iplease.lib.bento.api.common.subscribe.MessageSubscribeService

abstract class GatewayMessageSubscribeService: MessageSubscribeService {
    final override fun subscribe(message: Message) { getListeners().forEach { it.subscribe(message) } }
    abstract fun getListeners(): Iterable<MessageListener>
}