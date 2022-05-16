package com.iplease.lib.bento.api.common.message.payload

interface PayloadFactory<T> {
    fun create(value: T): Payload<T>
}