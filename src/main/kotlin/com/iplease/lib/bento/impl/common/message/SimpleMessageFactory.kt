package com.iplease.lib.bento.impl.common.message

import com.iplease.lib.bento.api.common.message.Message
import com.iplease.lib.bento.api.common.message.MessageFactory
import com.iplease.lib.bento.api.common.message.payload.Payload
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey

class SimpleMessageFactory: MessageFactory {
    override fun create(second: RoutingKey<*>, first: Payload<*>): Message = SimpleMessage(second, first)
}