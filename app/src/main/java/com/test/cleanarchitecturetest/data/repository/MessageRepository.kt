package com.test.cleanarchitecturetest.data.repository

import com.test.cleanarchitecturetest.domain.entity.message.Message
import com.test.cleanarchitecturetest.domain.repository.IMessageRepository

class MessageRepository : IMessageRepository {
    override fun getMessages() : List<Message> {
        // use retrofit or DB
        return listOf(
            Message("hello", "User_1"),
            Message("hello", "Operator_1")
        )
    }
}