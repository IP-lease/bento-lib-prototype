package com.iplease.lib.bento.api.global.subscribe

import com.iplease.lib.bento.api.global.message.Message

interface MessageSubscribeService {
    fun subscribe(message: Message)
}