package com.iplease.lib.bento.api.common.message.payload

interface PayloadFormatter<T> {
    fun format(data: T): Payload<*>
}
