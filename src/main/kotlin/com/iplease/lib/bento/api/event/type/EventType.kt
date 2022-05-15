package com.iplease.lib.bento.api.event.type

import com.iplease.lib.bento.api.event.data.EventData
import kotlin.reflect.KClass

interface EventType {
    fun getRoutingKey(): String
    fun getEventDataType(): KClass<out EventData>
}