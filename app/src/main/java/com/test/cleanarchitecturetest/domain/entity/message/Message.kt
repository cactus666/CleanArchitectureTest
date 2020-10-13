package com.test.cleanarchitecturetest.domain.entity.message

import java.util.*

class Message(
    val text: String,
    val author: String
) {

    fun defineOperator(author: String = this.author) : Boolean {
        return author.toLowerCase(Locale.ROOT).contentEquals("operator")
    }

}