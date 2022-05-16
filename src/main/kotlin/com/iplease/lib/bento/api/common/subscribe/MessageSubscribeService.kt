package com.iplease.lib.bento.api.common.subscribe

import com.iplease.lib.bento.api.common.message.Message

interface MessageSubscribeService {
    fun subscribe(message: Message)
}