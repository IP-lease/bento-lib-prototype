package com.iplease.lib.bento.error.type

import com.iplease.lib.bento.error.data.ErrorData
import kotlin.reflect.KClass

interface ErrorType {
    fun getRoutingKey(): String
    fun getErrorDataType(): KClass<out ErrorData>
}