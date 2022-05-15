package com.iplease.lib.bento.event.subscribe

interface Subscribable<T: Any> {
    fun subscribe(data: T)
}