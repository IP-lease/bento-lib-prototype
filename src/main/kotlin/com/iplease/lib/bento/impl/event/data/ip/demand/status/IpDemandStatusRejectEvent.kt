package com.iplease.lib.bento.impl.event.data.ip.demand.status

import com.iplease.lib.bento.api.event.data.EventData

data class IpDemandStatusRejectEvent (
    val demandUuid: Long,
): EventData