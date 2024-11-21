package org.sj.marghdarshak

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform