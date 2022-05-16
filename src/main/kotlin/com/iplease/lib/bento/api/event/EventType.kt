package com.iplease.lib.bento.api.event

import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey
import kotlin.reflect.KClass

interface EventType {
    fun getRoutingKey(): RoutingKey<*>
    fun getEventDataType(): KClass<out EventPayload>
}