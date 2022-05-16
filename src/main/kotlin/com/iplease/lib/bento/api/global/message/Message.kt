package com.iplease.lib.bento.api.global.message

import com.iplease.lib.bento.api.global.message.payload.Payload
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey

interface Message {
    fun getRoutingKey(): RoutingKey<*>
    fun getPayload(): Payload<*>
}