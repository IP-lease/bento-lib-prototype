package com.iplease.lib.bento.message

interface Message {
    fun getPayload(): ByteArray?
    fun getRoutingKey(): String?
}