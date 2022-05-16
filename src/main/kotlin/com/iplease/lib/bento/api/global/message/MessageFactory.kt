package com.iplease.lib.bento.api.global.message

import com.iplease.lib.bento.api.global.message.payload.Payload
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey

interface MessageFactory {
    fun create(second: RoutingKey<*>, first: Payload<*>): Message
}