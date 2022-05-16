package com.iplease.lib.bento.api.common.message

import com.iplease.lib.bento.api.common.message.payload.Payload
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey

interface Message {
    fun getRoutingKey(): RoutingKey<*>
    fun getPayload(): Payload<*>
}