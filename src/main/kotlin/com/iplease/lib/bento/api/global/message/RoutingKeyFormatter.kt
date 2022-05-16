package com.iplease.lib.bento.api.global.message

interface RoutingKeyFormatter<T> {
    fun format(data: T): String?
}
