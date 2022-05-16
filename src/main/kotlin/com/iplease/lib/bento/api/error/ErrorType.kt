package com.iplease.lib.bento.api.error

import com.iplease.lib.bento.api.global.message.routingkey.RoutingKey
import kotlin.reflect.KClass

interface ErrorType {
    fun getRoutingKey(): RoutingKey<*>
    fun getErrorDataType(): KClass<out ErrorPayload>
}