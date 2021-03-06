package com.iplease.lib.bento.impl.error.data.ip.demand.status

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandStatusAcceptError (
    val demandUuid: Long,
    val issuerUuid: Long,
    val managerUuid: Long,
    val demandedIp: String
): ErrorPayload<IpDemandStatusAcceptError> {
    override fun getValue() = this
}