package com.iplease.lib.bento.api.common.message

import com.iplease.lib.bento.api.common.message.payload.Payload
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey

interface MessageFactory {
    fun create(second: RoutingKey<*>, first: Payload<*>): Message
}