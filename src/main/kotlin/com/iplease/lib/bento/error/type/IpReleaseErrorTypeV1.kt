package com.iplease.lib.bento.error.type

import com.iplease.lib.bento.error.data.ErrorData
import kotlin.reflect.KClass

enum class IpReleaseErrorTypeV1(
    private val routingKey: String,
    private val eventDataType: KClass<ErrorData>
): ErrorType {
    IP_RELEASE_OFFER_ADD("v1.error.ip.release.offer.add", ErrorData::class),
    IP_RELEASE_OFFER_CANCEL("v1.error.ip.release.offer.cancel", ErrorData::class),
    IP_RELEASE_OFFER_ACCEPT("v1.error.ip.release.offer.accept", ErrorData::class),
    IP_RELEASE_RESERVE_ADD("v1.error.ip.release.reserve.add", ErrorData::class),
    IP_RELEASE_RESERVE_CANCEL("v1.error.ip.release.reserve.cancel", ErrorData::class);

    override fun getRoutingKey() = routingKey
    override fun getErrorDataType() = eventDataType
}