package com.iplease.lib.bento.type

import com.iplease.lib.bento.data.EventData
import kotlin.reflect.KClass


enum class IpReleaseEventTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<EventData>
): EventType {
    IP_RELEASE_OFFER_ADD("v1.event.ip.release.offer.add", EventData::class),
    IP_RELEASE_OFFER_CANCEL("v1.event.ip.release.offer.cancel", EventData::class),
    IP_RELEASE_OFFER_ACCEPT("v1.event.ip.release.offer.accept", EventData::class),
    IP_RELEASE_RESERVE_ADD("v1.event.ip.release.reserve.add", EventData::class),
    IP_RELEASE_RESERVE_CANCEL("v1.event.ip.release.reserve.cancel", EventData::class);

    override fun getRoutingKey() = routingKey
    override fun getEventDataType() = eventDataType
}