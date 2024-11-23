package org.sj.marghdarshak.data

import kotlinx.coroutines.flow.Flow
import org.sj.marghdarshak.domain.Message
import org.sj.marghdarshak.domain.MessageRepository

class MessageRepositoryImpl(
    private val messageDataSource: MessageDataSource
) : MessageRepository {

    override suspend fun sendMessages(message: Message) {
        messageDataSource.addMessage(message)
    }

    override fun getMessages(): Flow<List<Message>> = messageDataSource.messages

    override suspend fun deleteMessages(messageId : String) {
        messageDataSource.deleteMessage(messageId)
    }
}