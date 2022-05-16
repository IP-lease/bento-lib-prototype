package com.iplease.lib.bento.impl.error.type

import com.iplease.lib.bento.api.error.ErrorPayload
import com.iplease.lib.bento.api.error.ErrorType
import com.iplease.lib.bento.util.RoutingKeys
import kotlin.reflect.KClass

@Suppress("unused")
enum class GlobalErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out ErrorPayload>
): ErrorType {
    WRONG_PAYLOAD("v1.error.wrong_payload", ErrorPayload::class),
    UNKNOWN_ERROR("v1.error.unknown", ErrorPayload::class);

    override fun getRoutingKey() = RoutingKeys.of(routingKey)
    override fun getErrorDataType() = eventDataType
}