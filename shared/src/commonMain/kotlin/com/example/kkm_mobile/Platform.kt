package com.example.kkm_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform