package com.iplease.lib.bento.impl.event.data.ip.demand

import com.iplease.lib.bento.api.event.data.EventData

data class IpDemandCreateEvent (
    val demandUuid: Long,
): EventData