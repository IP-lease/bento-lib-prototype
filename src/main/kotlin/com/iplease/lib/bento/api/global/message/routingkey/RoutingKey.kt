package com.iplease.lib.bento.api.global.message.routingkey

interface RoutingKey<T> {
    fun getValue(): T
}