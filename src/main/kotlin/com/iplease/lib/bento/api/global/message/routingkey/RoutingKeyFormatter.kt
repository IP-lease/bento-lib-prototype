package com.iplease.lib.bento.api.global.message.routingkey

interface RoutingKeyFormatter<T> {
    fun format(data: T): RoutingKey<*>
}
