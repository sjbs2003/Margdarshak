package org.sj.marghdarshak.domain

data class Message(
    val id: String,
    val content: String,
    val isUserMessage: Boolean,
    val timestamp: Long = System.currentTimeMillis(),
    val attachmentUrl: String? = null
)