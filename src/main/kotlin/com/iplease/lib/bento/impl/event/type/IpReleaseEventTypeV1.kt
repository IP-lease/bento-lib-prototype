package com.iplease.lib.bento.impl.event.type

import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.event.type.EventType
import kotlin.reflect.KClass

enum class IpReleaseEventTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<EventData>
): EventType {
    IP_RELEASE_SUCCESS("v1.event.ip.release.released", EventData::class);

    override fun getRoutingKey() = routingKey
    override fun getEventDataType() = eventDataType
}