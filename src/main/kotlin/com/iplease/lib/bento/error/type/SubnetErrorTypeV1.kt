package com.iplease.lib.bento.error.type

import com.iplease.lib.bento.error.data.ErrorData
import kotlin.reflect.KClass

enum class SubnetErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<ErrorData>
): ErrorType {
    SUBNET_ADD("v1.error.subnet.add", ErrorData::class),
    SUBNET_REMOVE("v1.error.subnet.remove", ErrorData::class);

    override fun getRoutingKey() = routingKey
    override fun getErrorDataType() = eventDataType
}