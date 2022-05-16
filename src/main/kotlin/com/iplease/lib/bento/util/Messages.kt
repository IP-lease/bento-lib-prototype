package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.global.message.MessageFactory

object Messages {
    private lateinit var messageFactory: MessageFactory
    fun setMessageFactory(messageFactory: MessageFactory) { this.messageFactory = messageFactory }

    fun of(first: String?, second: ByteArray?) = messageFactory.create(first, second)
}