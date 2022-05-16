package com.iplease.lib.bento.impl.error.data.ip.demand.status

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandStatusRejectError (
    val demandUuid: Long,
): ErrorPayload<IpDemandStatusRejectError> {
    override fun getValue() = this
}