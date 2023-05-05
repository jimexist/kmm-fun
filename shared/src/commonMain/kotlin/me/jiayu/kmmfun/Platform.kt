package me.jiayu.kmmfun

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform