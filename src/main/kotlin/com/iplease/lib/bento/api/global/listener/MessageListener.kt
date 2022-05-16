package com.iplease.lib.bento.api.global.listener

import com.iplease.lib.bento.api.global.message.Message

interface MessageListener: Listener<Message> {
    override fun subscribe(data: Message)
}