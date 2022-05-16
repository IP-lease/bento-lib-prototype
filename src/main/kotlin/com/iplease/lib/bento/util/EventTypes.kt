package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.event.EventPayload
import com.iplease.lib.bento.api.event.EventType
import kotlin.reflect.KClass

object EventTypes {
    private val types: MutableSet<EventType> = mutableSetOf()

    fun addTypes(vararg type: EventType) {
        types.addAll(type)
    }

    fun of(eventPayloadType: KClass<out EventPayload>) =
        types.find { it.getEventDataType() == eventPayloadType }!!
}