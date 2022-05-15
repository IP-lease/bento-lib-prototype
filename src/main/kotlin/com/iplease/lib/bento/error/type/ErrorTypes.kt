package com.iplease.lib.bento.error.type

import com.iplease.lib.bento.error.data.ErrorData
import kotlin.reflect.KClass

object ErrorTypes {
    private val types: MutableSet<ErrorType> = mutableSetOf()

    fun addType(vararg type: ErrorType) {
        types.addAll(type)
    }

    fun of(errorDataType: KClass<out ErrorData>) =
        types.find { it.getErrorDataType() == errorDataType }!!
}