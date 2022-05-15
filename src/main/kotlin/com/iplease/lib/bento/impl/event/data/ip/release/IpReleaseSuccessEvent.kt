package com.iplease.lib.bento.impl.event.data.ip.release

data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
)