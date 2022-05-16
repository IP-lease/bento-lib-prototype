package com.iplease.lib.bento.api.common.listener

interface Listener<T: Any> {
    fun subscribe(data: T)
}