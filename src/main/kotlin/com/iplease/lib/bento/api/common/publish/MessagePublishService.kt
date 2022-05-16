package com.iplease.lib.bento.api.common.publish

import com.iplease.lib.bento.api.common.message.Message

interface MessagePublishService {
    fun publish(message: Message)
}