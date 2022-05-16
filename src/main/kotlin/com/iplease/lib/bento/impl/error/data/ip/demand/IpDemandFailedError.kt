package com.iplease.lib.bento.impl.error.data.ip.demand

import com.iplease.lib.bento.api.error.ErrorData

data class IpDemandFailedError (
    val demandUuid: Long,
): ErrorData