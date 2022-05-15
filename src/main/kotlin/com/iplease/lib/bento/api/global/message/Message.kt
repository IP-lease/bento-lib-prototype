package com.iplease.lib.bento.api.global.message

interface Message {
    fun getPayload(): ByteArray?
    fun getRoutingKey(): String?
}