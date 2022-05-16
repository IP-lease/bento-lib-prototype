package com.iplease.lib.bento.api.common.message.routingkey

interface RoutingKeyFormatter<T> {
    fun format(data: T): RoutingKey<*>
}
