package com.iplease.lib.bento.api.global.message.payload

interface PayloadFormatter<T> {
    fun format(data: T): Payload<*>
}
