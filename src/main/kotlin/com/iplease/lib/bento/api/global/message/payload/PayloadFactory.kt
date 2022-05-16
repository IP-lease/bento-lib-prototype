package com.iplease.lib.bento.api.global.message.payload

interface PayloadFactory<T> {
    fun create(value: T): Payload<T>
}