package com.iplease.lib.bento.impl.common.message.routingkey

import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey
import com.iplease.lib.bento.api.common.message.routingkey.RoutingKeyFactory

class StringRoutingKeyFactory: RoutingKeyFactory<String> {
    override fun create(value: String): RoutingKey<String> = StringRoutingKey(value)
}