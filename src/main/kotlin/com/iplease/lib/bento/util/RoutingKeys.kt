package com.iplease.lib.bento.util

import com.iplease.lib.bento.api.global.message.routingkey.RoutingKeyFactory
import kotlin.reflect.KClass

@Suppress("unchecked_cast")
object RoutingKeys {
    private lateinit var routingKeyFactories: MutableMap<KClass<out Any>, RoutingKeyFactory<out Any>>
    fun <T: Any> addRoutingKeyFactory(clazz: KClass<T>, routingKeyFactory: RoutingKeyFactory<T>) { this.routingKeyFactories[clazz] = routingKeyFactory }

    fun <T: Any> of(value: T) = routingKeyFactories[value::class]
        ?.let { it as RoutingKeyFactory<T> }?.create(value)
        ?: throw UnsupportedOperationException("No RoutingKeyFactory found for ${value::class}")
}