package com.test.cleanarchitecturetest.presentation.ui

import androidx.lifecycle.MutableLiveData
import com.test.cleanarchitecturetest.domain.usecase.messages.GetMessages
import com.test.cleanarchitecturetest.presentation.model.MessageModel
import com.test.cleanarchitecturetest.presentation.model.OperatorMessage
import com.test.cleanarchitecturetest.presentation.model.UserMessage

class ActivityViewModel(
    private val getMessages: GetMessages
) {

    val listMessages = MutableLiveData<List<MessageModel>>()

    init {
        getMessages({
            listMessages.value =
                it.map { msg ->
                if (msg.defineOperator()) {
                    OperatorMessage.map(msg)
                } else {
                    UserMessage.map(msg)
                }
            }
        }, {
            // update ui
        })
    }

}