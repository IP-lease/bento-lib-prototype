package com.iplease.lib.bento.api.global.publish

import com.iplease.lib.bento.api.global.message.Message

interface MessagePublishService {
    fun publish(message: Message)
}