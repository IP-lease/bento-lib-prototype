package com.iplease.lib.bento.impl.event.data.ip.demand

import com.iplease.lib.bento.api.event.EventPayload

data class IpDemandCreateEvent (
    val demandUuid: Long,
): EventPayload<IpDemandCreateEvent> {
    override fun getValue() = this
}