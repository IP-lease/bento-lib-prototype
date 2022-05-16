package com.iplease.lib.bento.api.common.publish

interface TypedMessagePublishService<K, V>: MessagePublishService {
    fun publish(routingKey: K, data: V)
}