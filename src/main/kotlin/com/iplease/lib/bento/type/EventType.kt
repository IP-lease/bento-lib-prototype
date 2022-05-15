package com.iplease.lib.bento.type

import com.iplease.lib.bento.data.EventData
import kotlin.reflect.KClass

interface EventType {
    fun getRoutingKey(): String
    fun getEventDataType(): KClass<out EventData>
}