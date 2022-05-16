package com.iplease.lib.bento.api.global.message

interface PayloadFormatter<T> {
    fun format(data: T): ByteArray?
}
