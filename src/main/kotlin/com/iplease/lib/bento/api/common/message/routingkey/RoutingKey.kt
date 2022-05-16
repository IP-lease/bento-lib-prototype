package com.iplease.lib.bento.api.common.message.routingkey

interface RoutingKey<T> {
    fun getValue(): T
}