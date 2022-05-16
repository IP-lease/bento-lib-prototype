package com.iplease.lib.bento.impl.error.type

import com.iplease.lib.bento.api.error.data.ErrorData
import com.iplease.lib.bento.api.error.type.ErrorType
import com.iplease.lib.bento.impl.error.data.ip.release.IpReleaseSuccessError
import com.iplease.lib.bento.util.RoutingKeys
import kotlin.reflect.KClass

enum class IpReleaseErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<out ErrorData>
): ErrorType {
    IP_RELEASE_SUCCESS("v1.error.ip.release.released", IpReleaseSuccessError::class);

    override fun getRoutingKey() = RoutingKeys.of(routingKey)
    override fun getErrorDataType() = eventDataType
}