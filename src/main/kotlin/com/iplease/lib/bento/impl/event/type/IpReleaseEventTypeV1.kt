package com.iplease.lib.bento.impl.event.type

import com.iplease.lib.bento.api.event.EventPayload
import com.iplease.lib.bento.api.event.EventType
import com.iplease.lib.bento.impl.event.data.ip.release.IpReleaseSuccessEvent
import com.iplease.lib.bento.util.RoutingKeys
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpReleaseEventTypeV1(
    private val routingKey: String,
    private val eventPayloadType: KClass<out EventPayload>
): EventType {
    IP_RELEASE_SUCCESS("v1.event.ip.release.released", IpReleaseSuccessEvent::class);

    override fun getRoutingKey() = RoutingKeys.of(routingKey)
    override fun getEventDataType() = eventPayloadType
}