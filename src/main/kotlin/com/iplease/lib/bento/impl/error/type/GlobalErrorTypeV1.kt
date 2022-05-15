package com.iplease.lib.bento.impl.error.type

import com.iplease.lib.bento.api.error.data.ErrorData
import com.iplease.lib.bento.api.error.type.ErrorType
import kotlin.reflect.KClass

enum class GlobalErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out ErrorData>
): ErrorType {
    WRONG_PAYLOAD("v1.error.wrong_payload", ErrorData::class),
    UNKNOWN_ERROR("v1.error.unknown", ErrorData::class);

    override fun getRoutingKey() = routingKey
    override fun getErrorDataType() = eventDataType
}