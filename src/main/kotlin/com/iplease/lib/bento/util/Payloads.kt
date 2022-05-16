package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.common.message.payload.PayloadFactory
import kotlin.reflect.KClass

@Suppress("unchecked_cast")
object Payloads {
    private lateinit var payloadFactories: MutableMap<KClass<out Any>, PayloadFactory<out Any>>
    fun <T: Any> addPayloadFactory(clazz: KClass<T>, payloadFactory: PayloadFactory<T>) { this.payloadFactories[clazz] = payloadFactory }

    fun <T: Any> of(value: T) = payloadFactories[value::class]
        ?.let { it as PayloadFactory<T> }?.create(value)
        ?: throw UnsupportedOperationException("No RoutingKeyFactory found for ${value::class}")
}