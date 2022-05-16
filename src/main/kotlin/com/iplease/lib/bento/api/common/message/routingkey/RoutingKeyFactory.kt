package com.iplease.lib.bento.api.common.message.routingkey

interface RoutingKeyFactory<T> {
    fun create(value: T): RoutingKey<T>
}