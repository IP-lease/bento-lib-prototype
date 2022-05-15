package com.iplease.lib.bento.impl.event.data.ip.release

import com.iplease.lib.bento.api.event.data.EventData

data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): EventData