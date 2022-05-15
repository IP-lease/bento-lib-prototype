package com.iplease.lib.bento.api.global.subscribe

import com.iplease.lib.bento.api.global.message.Message

interface MessageSubscriber: Subscribable<Message> {
    override fun subscribe(data: Message)
}