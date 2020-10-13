package com.test.cleanarchitecturetest.domain.usecase.messages

import com.test.cleanarchitecturetest.domain.entity.message.Message
import com.test.cleanarchitecturetest.domain.repository.IMessageRepository
import java.lang.Exception

class GetMessages(
    private val messageRepository: IMessageRepository
) {

    operator fun invoke(successRequest: (messages: List<Message>) -> Unit, failRequest: (ex: Throwable) -> Unit) {
        try {
            successRequest(messageRepository.getMessages())
        } catch (ex: Exception) {
            failRequest(ex)
        }
    }

}