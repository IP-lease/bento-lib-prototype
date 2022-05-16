package com.iplease.lib.bento.impl.event.data.ip.demand.status

import com.iplease.lib.bento.api.event.EventPayload

data class IpDemandStatusAcceptEvent (
    val demandUuid: Long,
    val issuerUuid: Long,
    val managerUuid: Long,
    val demandedIp: String
): EventPayload<IpDemandStatusAcceptEvent> {
    override fun getValue() = this
}