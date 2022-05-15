package com.iplease.lib.bento.api.global.subscribe

interface Subscribable<T: Any> {
    fun subscribe(data: T)
}