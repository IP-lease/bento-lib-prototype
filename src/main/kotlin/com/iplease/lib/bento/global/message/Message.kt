package com.iplease.lib.bento.global.message

interface Message {
    fun getPayload(): ByteArray?
    fun getRoutingKey(): String?
}