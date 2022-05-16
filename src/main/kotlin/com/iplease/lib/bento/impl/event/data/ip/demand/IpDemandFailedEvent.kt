package com.iplease.lib.bento.impl.event.data.ip.demand

import com.iplease.lib.bento.api.event.EventPayload

data class IpDemandFailedEvent (
    val demandUuid: Long,
): EventPayload