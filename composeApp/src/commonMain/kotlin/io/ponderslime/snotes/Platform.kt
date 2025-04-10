package io.ponderslime.snotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform