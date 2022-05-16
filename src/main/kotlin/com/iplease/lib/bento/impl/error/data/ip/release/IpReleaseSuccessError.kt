package com.iplease.lib.bento.impl.error.data.ip.release

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpReleaseSuccessError (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): ErrorPayload