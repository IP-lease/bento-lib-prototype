package com.iplease.lib.bento.impl.error.data.ip.demand.status

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandStatusConfirmError (
    val demandUuid: Long,
): ErrorPayload<IpDemandStatusConfirmError> {
    override fun getValue() = this
}