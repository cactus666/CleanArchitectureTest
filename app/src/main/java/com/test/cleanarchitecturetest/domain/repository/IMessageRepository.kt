package com.test.cleanarchitecturetest.domain.repository

import com.test.cleanarchitecturetest.domain.entity.message.Message

interface IMessageRepository {
    fun getMessages() : List<Message>
}