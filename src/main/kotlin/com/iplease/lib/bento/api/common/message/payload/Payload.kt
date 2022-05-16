package com.iplease.lib.bento.api.common.message.payload

interface Payload<T> {
    fun getValue(): T
}