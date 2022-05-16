package com.iplease.lib.bento.api.common.listener

import com.iplease.lib.bento.api.common.message.Message

interface MessageListener: Listener<Message> {
    override fun subscribe(data: Message)
}