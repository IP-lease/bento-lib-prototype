package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.error.data.ErrorData
import com.iplease.lib.bento.api.error.type.ErrorType
import kotlin.reflect.KClass

object ErrorTypes {
    private val types: MutableSet<ErrorType> = mutableSetOf()

    fun addTypes(vararg type: ErrorType) {
        types.addAll(type)
    }

    fun of(errorDataType: KClass<out ErrorData>) =
        types.find { it.getErrorDataType() == errorDataType }!!
}