package com.iplease.lib.bento.impl.common.message

import com.iplease.lib.bento.api.common.message.Message
import com.iplease.lib.bento.api.common.message.payload.Payload
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey

data class SimpleMessage(
    private val routingKey: RoutingKey<*>,
    private val payload: Payload<*>
): Message {
    override fun getRoutingKey(): RoutingKey<*> = routingKey
    override fun getPayload(): Payload<*> = payload
}