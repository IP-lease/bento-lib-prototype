package com.iplease.lib.bento.impl.error.data.ip.demand.status

import com.iplease.lib.bento.api.error.ErrorData

data class IpDemandStatusConfirmError (
    val demandUuid: Long,
): ErrorData