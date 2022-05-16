package com.iplease.lib.bento.impl.error.data.ip.demand

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandCreateError (
    val demandUuid: Long,
): ErrorPayload<IpDemandCreateError> {
    override fun getValue() = this
}