package com.iplease.lib.bento.global.subscribe

interface Subscribable<T: Any> {
    fun subscribe(data: T)
}