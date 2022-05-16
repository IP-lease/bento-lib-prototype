package com.iplease.lib.bento.impl.event.data.ip.demand.info

import com.iplease.lib.bento.api.event.EventData

data class IpDemandInfoUpdateEvent(
    val demandUuid: Long
): EventData