package org.sj.marghdarshak.domain

import kotlinx.coroutines.flow.Flow

interface MessageRepository {
    fun getMessages(): Flow<List<Message>>
    suspend fun sendMessages(message: Message)
    suspend fun deleteMessages(messageId: String)
}