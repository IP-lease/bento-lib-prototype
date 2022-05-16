package com.iplease.lib.bento.api.global.message.routingkey

interface RoutingKeyFactory<T> {
    fun create(value: T): RoutingKey<T>
}