package com.iplease.lib.bento.api.global.message.payload

interface Payload<T> {
    fun getValue(): T
}