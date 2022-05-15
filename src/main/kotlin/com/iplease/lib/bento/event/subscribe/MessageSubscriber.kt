package com.iplease.lib.bento.event.subscribe

import com.iplease.lib.bento.event.message.Message

interface MessageSubscriber: Subscribable<Message> {
    override fun subscribe(data: Message)
}