package com.example.simplecounter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform