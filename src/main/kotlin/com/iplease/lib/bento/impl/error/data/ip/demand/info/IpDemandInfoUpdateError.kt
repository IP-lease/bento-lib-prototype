package com.iplease.lib.bento.impl.error.data.ip.demand.info

import com.iplease.lib.bento.api.error.data.ErrorData

data class IpDemandInfoUpdateError (
    val demandUuid: Long,
): ErrorData