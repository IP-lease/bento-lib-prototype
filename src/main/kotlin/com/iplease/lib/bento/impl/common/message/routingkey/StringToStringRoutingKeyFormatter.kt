package com.iplease.lib.bento.impl.common.message.routingkey

import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKeyFormatter

class StringToStringRoutingKeyFormatter: RoutingKeyFormatter<String> {
    override fun format(data: String): RoutingKey<*> = StringRoutingKey(data)
}