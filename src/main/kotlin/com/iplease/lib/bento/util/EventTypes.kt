package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.event.type.EventType
import kotlin.reflect.KClass

object EventTypes {
    private val types: MutableSet<EventType> = mutableSetOf()

    fun addTypes(vararg type: EventType) {
        types.addAll(type)
    }

    fun of(eventDataType: KClass<out EventData>) =
        types.find { it.getEventDataType() == eventDataType }!!
}