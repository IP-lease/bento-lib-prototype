package com.iplease.lib.bento.global.subscribe

import com.iplease.lib.bento.global.message.Message

interface MessageSubscriber: Subscribable<Message> {
    override fun subscribe(data: Message)
}