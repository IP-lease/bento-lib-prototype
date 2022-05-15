package com.iplease.lib.bento.impl.event.data.ip.demand.status

import com.iplease.lib.bento.api.event.data.EventData

data class IpDemandStatusConfirmEvent (
    val demandUuid: Long,
): EventData