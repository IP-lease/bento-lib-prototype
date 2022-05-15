package com.iplease.lib.bento.event.message

interface Message {
    fun getPayload(): ByteArray?
    fun getRoutingKey(): String?
}