package com.iplease.lib.bento.api.error.type

import com.iplease.lib.bento.api.error.data.ErrorData
import kotlin.reflect.KClass

object ErrorTypes {
    private val types: MutableSet<ErrorType> = mutableSetOf()

    fun addType(vararg type: ErrorType) {
        types.addAll(type)
    }

    fun of(errorDataType: KClass<out ErrorData>) =
        types.find { it.getErrorDataType() == errorDataType }!!
}