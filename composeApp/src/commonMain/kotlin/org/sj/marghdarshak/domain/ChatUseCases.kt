package org.sj.marghdarshak.domain

import java.util.UUID

class SendMessageUseCase(
    private val repository: MessageRepository
) {
    suspend operator fun invoke(content: String, isUserMessage: Boolean = true) {
        val message = Message(
            id = UUID.randomUUID().toString(),
            content = content,
            isUserMessage = isUserMessage
        )
        repository.sendMessages(message)
    }
}

class GetMessagesUseCase(
    private val repository: MessageRepository
) {
    operator fun invoke() = repository.getMessages()
}