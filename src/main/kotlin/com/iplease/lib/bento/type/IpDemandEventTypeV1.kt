package com.iplease.lib.bento.type

import com.iplease.lib.bento.EventData
import kotlin.reflect.KClass


enum class IpDemandEventTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out EventData>
): EventType {
    IP_DEMAND_INFO_UPDATE("v1.event.ip.demand.info.update", EventData::class),
    IP_DEMAND_ADD("v1.event.ip.demand.add", EventData::class),
    IP_DEMAND_CREATE("v1.event.ip.demand.create", EventData::class),
    IP_DEMAND_CANCEL("v1.event.ip.demand.cancel", EventData::class),
    IP_DEMAND_STATUS_CONFIRM("v1.event.ip.demand.status.confirm", EventData::class),
    IP_DEMAND_STATUS_ACCEPT("v1.event.ip.demand.status.accept", EventData::class),
    IP_DEMAND_STATUS_REJECT("v1.event.ip.demand.status.reject", EventData::class),
    IP_DEMAND_SUCCESS("v1.event.ip.demand.success", EventData::class),
    IP_DEMAND_FAILED("v1.event.ip.demand.failed", EventData::class);

    override fun getRoutingKey() = routingKey
    override fun getEventDataType() = eventDataType
}