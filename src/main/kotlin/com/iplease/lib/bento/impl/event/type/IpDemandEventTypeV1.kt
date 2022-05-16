package com.iplease.lib.bento.impl.event.type

import com.iplease.lib.bento.api.event.data.EventData
import com.iplease.lib.bento.api.event.type.EventType
import com.iplease.lib.bento.impl.event.data.ip.demand.*
import com.iplease.lib.bento.impl.event.data.ip.demand.info.IpDemandInfoUpdateEvent
import com.iplease.lib.bento.impl.event.data.ip.demand.status.IpDemandStatusAcceptEvent
import com.iplease.lib.bento.impl.event.data.ip.demand.status.IpDemandStatusConfirmEvent
import com.iplease.lib.bento.impl.event.data.ip.demand.status.IpDemandStatusRejectEvent
import com.iplease.lib.bento.util.RoutingKeys
import kotlin.reflect.KClass

enum class IpDemandEventTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out EventData>
): EventType {
    IP_DEMAND_INFO_UPDATE("v1.event.ip.demand.info.update", IpDemandInfoUpdateEvent::class),
    IP_DEMAND_CREATE("v1.event.ip.demand.create", IpDemandCreateEvent::class),
    IP_DEMAND_STATUS_CONFIRM("v1.event.ip.demand.status.confirm", IpDemandStatusConfirmEvent::class),
    IP_DEMAND_STATUS_ACCEPT("v1.event.ip.demand.status.accept", IpDemandStatusAcceptEvent::class),
    IP_DEMAND_STATUS_REJECT("v1.event.ip.demand.status.reject", IpDemandStatusRejectEvent::class),
    IP_DEMAND_SUCCESS("v1.event.ip.demand.success", IpDemandSuccessEvent::class),
    IP_DEMAND_FAILED("v1.event.ip.demand.failed", IpDemandFailedEvent::class);

    override fun getRoutingKey() = RoutingKeys.of(routingKey)
    override fun getEventDataType() = eventDataType
}