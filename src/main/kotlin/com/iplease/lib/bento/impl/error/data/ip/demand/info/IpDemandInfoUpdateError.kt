package com.iplease.lib.bento.impl.error.data.ip.demand.info

import com.iplease.lib.bento.api.error.ErrorPayload

data class IpDemandInfoUpdateError (
    val demandUuid: Long,
): ErrorPayload