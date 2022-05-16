package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.error.ErrorPayload
import com.iplease.lib.bento.api.error.ErrorType
import kotlin.reflect.KClass

object ErrorTypes {
    private val types: MutableSet<ErrorType> = mutableSetOf()

    fun addTypes(vararg type: ErrorType) {
        types.addAll(type)
    }

    fun of(errorPayloadType: KClass<out ErrorPayload>) =
        types.find { it.getErrorDataType() == errorPayloadType }!!
}