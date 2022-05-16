package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.global.message.MessageFactory
import com.iplease.lib.bento.api.global.message.payload.Payload
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey

object Messages {
    private lateinit var messageFactory: MessageFactory
    fun setMessageFactory(messageFactory: MessageFactory) { this.messageFactory = messageFactory }

    fun of(first: RoutingKey<*>, second: Payload<*>) = messageFactory.create(first, second)
    fun of(first: String, second: ByteArray) = of(RoutingKeys.of(first), Payloads.of(second))
}