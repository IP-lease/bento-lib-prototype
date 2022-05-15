package com.iplease.lib.bento.api.error.type

import com.iplease.lib.bento.api.error.data.ErrorData
import kotlin.reflect.KClass

interface ErrorType {
    fun getRoutingKey(): String
    fun getErrorDataType(): KClass<out ErrorData>
}