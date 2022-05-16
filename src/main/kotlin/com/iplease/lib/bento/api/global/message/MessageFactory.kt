package com.iplease.lib.bento.api.global.message

interface MessageFactory {
    fun create(first: String?, second: ByteArray?): Message
}