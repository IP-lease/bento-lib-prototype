package com.iplease.lib.bento.impl.event.data.ip.demand.info

import com.iplease.lib.bento.api.event.EventPayload

data class IpDemandInfoUpdateEvent(
    val demandUuid: Long
): EventPayload