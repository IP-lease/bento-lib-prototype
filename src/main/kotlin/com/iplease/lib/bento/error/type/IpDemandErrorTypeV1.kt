package com.iplease.lib.bento.error.type

import com.iplease.lib.bento.error.data.ErrorData
import kotlin.reflect.KClass

enum class IpDemandErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out ErrorData>
): ErrorType {
    IP_DEMAND_INFO_UPDATE("v1.error.ip.demand.info.update", ErrorData::class),
    IP_DEMAND_ADD("v1.error.ip.demand.add", ErrorData::class),
    IP_DEMAND_CREATE("v1.error.ip.demand.create", ErrorData::class),
    IP_DEMAND_CANCEL("v1.error.ip.demand.cancel", ErrorData::class),
    IP_DEMAND_STATUS_CONFIRM("v1.error.ip.demand.status.confirm", ErrorData::class),
    IP_DEMAND_STATUS_ACCEPT("v1.error.ip.demand.status.accept", ErrorData::class),
    IP_DEMAND_STATUS_REJECT("v1.error.ip.demand.status.reject", ErrorData::class),
    IP_DEMAND_SUCCESS("v1.error.ip.demand.success", ErrorData::class),
    IP_DEMAND_FAILED("v1.error.ip.demand.failed", ErrorData::class);

    override fun getRoutingKey() = routingKey
    override fun getErrorDataType() = eventDataType
}