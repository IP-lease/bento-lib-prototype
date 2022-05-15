package com.iplease.lib.bento.type

import com.iplease.lib.bento.EventData
import kotlin.reflect.KClass

object EventTypes {
    private val types: MutableSet<EventType> = mutableSetOf()

    fun addType(vararg type: EventType) {
        types.addAll(type)
    }

    fun of(eventDataType: KClass<out EventData>) =
        types.find { it.getEventDataType() == eventDataType }!!
}