package com.iplease.lib.bento.impl.event.data.ip.release

import com.iplease.lib.bento.api.event.EventPayload

data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): EventPayload