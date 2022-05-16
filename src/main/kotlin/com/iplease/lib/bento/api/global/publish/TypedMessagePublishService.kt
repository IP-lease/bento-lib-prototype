package com.iplease.lib.bento.api.global.publish

interface TypedMessagePublishService<K, V>: MessagePublishService {
    fun publish(routingKey: K, data: V)
}