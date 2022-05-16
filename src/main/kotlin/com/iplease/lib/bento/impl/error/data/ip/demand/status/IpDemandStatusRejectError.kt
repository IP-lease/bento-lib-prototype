package com.iplease.lib.bento.impl.error.data.ip.demand.status

import com.iplease.lib.bento.api.error.ErrorData

data class IpDemandStatusRejectError (
    val demandUuid: Long,
): ErrorData