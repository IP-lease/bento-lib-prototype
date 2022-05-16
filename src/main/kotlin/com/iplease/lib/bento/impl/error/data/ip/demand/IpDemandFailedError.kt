package com.iplease.lib.bento.impl.error.data.ip.demand

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandFailedError (
    val demandUuid: Long,
): ErrorPayload<IpDemandFailedError> {
    override fun getValue() = this
}