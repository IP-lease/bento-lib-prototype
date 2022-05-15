package com.iplease.lib.bento.impl.event.type

import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.event.type.EventType
import kotlin.reflect.KClass

enum class SubnetEventTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<EventData>
): EventType {
    SUBNET_ADD("v1.event.subnet.add", EventData::class),
    SUBNET_REMOVE("v1.event.subnet.remove", EventData::class);

    override fun getRoutingKey() = routingKey
    override fun getEventDataType() = eventDataType
}