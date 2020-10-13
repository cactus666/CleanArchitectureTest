package com.test.cleanarchitecturetest.presentation.model

import com.test.cleanarchitecturetest.domain.entity.message.Message

sealed class MessageModel

data class OperatorMessage(
    val text: String
) : MessageModel() {
    companion object {
        fun map(message: Message): OperatorMessage {
            return OperatorMessage(
                message.text
            )
        }
    }
}

class UserMessage(
    val text: String,
    val author: String
) : MessageModel() {
    companion object {
        fun map(message: Message): UserMessage {
            return UserMessage(
                message.text,
                message.author
            )
        }
    }
}