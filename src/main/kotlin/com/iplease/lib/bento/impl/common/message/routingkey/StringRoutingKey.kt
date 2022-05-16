package com.iplease.lib.bento.impl.common.message.routingkey

import com.iplease.lib.bento.api.common.message.routingkey.RoutingKey

class StringRoutingKey(
    private val value: String
): RoutingKey<String> {
    override fun getValue() = value
}