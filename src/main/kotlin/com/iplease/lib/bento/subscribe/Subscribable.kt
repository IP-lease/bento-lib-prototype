package com.iplease.lib.bento.subscribe

interface Subscribable<T: Any> {
    fun subscribe(data: T)
}