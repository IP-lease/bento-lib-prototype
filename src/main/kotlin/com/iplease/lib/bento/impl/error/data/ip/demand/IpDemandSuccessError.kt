package com.iplease.lib.bento.impl.error.data.ip.demand

import com.iplease.lib.bento.api.error.data.ErrorData
import java.time.LocalDate

data class IpDemandSuccessError (
    val demandUuid: Long,
    val issuerUuid: Long,
    val assignerUuid: Long,
    val assignedAt: LocalDate,
    val expireAt: LocalDate,
    val ipFirst: Int,
    val ipSecond: Int,
    val ipThird: Int,
    val ipFourth: Int
): ErrorData