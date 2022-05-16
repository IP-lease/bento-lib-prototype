package com.iplease.lib.bento.impl.global.publish

import com.iplease.lib.bento.api.global.message.payload.PayloadFormatter
import com.iplease.lib.bento.api.global.message.routingkey.RoutingKeyFormatter
import com.iplease.lib.bento.api.global.publish.TypedMessagePublishService
import com.iplease.lib.bento.util.Messages

abstract class FormatSupportedMessagePublishService<K, V>: TypedMessagePublishService<K, V> {
    abstract fun getRoutingKeyFormatter(): RoutingKeyFormatter<K>
    abstract fun getPayloadFormatter(): PayloadFormatter<V>

    final override fun publish(routingKey: K, data: V) {
        (getRoutingKeyFormatter().format(routingKey) to getPayloadFormatter().format(data))
            .let { Messages.of(it.first, it.second) }
            .let { publish(it) }
    }
}