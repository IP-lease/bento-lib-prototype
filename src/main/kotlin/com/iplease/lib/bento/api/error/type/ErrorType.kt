package com.iplease.lib.bento.api.error.type

import com.iplease.lib.bento.api.error.data.ErrorData
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey
import kotlin.reflect.KClass

interface ErrorType {
    fun getRoutingKey(): RoutingKey<*>
    fun getErrorDataType(): KClass<out ErrorData>
}