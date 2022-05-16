package com.iplease.lib.bento.api.global.listener

interface Listener<T: Any> {
    fun subscribe(data: T)
}