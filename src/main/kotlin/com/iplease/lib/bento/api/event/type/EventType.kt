package com.iplease.lib.bento.api.event.type

import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey
import kotlin.reflect.KClass

interface EventType {
    fun getRoutingKey(): RoutingKey<*>
    fun getEventDataType(): KClass<out EventData>
}