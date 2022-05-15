package com.iplease.lib.bento.impl.event.data.ip.demand

import com.iplease.lib.bento.api.event.data.EventData
import java.time.LocalDate

data class IpDemandSuccessEvent (
    val demandUuid: Long,
    val issuerUuid: Long,
    val assignerUuid: Long,
    val assignedAt: LocalDate,
    val expireAt: LocalDate,
    val ipFirst: Int,
    val ipSecond: Int,
    val ipThird: Int,
    val ipFourth: Int
): EventData