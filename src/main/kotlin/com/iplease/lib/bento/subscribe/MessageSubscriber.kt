package com.iplease.lib.bento.subscribe

import com.iplease.lib.bento.message.Message

interface MessageSubscriber: Subscribable<Message> {
    override fun subscribe(data: Message)
}