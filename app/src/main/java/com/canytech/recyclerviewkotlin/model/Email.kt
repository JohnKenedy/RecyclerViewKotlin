package com.canytech.recyclerviewkotlin.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails() = mutableListOf(
    email {
        user = "Facebook"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "21 Jan"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "01 Dec"
        stared = false
    },
    email {
        user = "Lindsey"
        subject = "Happy Birthday"
        preview = "Happy birthday to you, happy birthday to you, HAPPYYYYYYYYYYYY"
        date = "05 Apr"
        stared = true
        unread = true
    },
    email {
        user = "Your mother"
        subject = "You will broke the TV"
        preview = "I think I'm read mom, and not Grandma, hehe"
        date = "15 May"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "21 Jan"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "01 Dec"
        stared = false
    },
    email {
        user = "Lindsey"
        subject = "Happy Birthday"
        preview = "Happy birthday to you, happy birthday to you, HAPPYYYYYYYYYYYY"
        date = "05 Apr"
        stared = true
        unread = true
    },
    email {
        user = "Your mother"
        subject = "You will broke the TV"
        preview = "I think I'm read mom, and not Grandma, hehe"
        date = "15 May"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "21 Jan"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "This is a random text for test the recyclerview"
        preview = "The preview, is like something you can see before that you really open"
        date = "01 Dec"
        stared = false
    },
    email {
        user = "Lindsey"
        subject = "Happy Birthday"
        preview = "Happy birthday to you, happy birthday to you, HAPPYYYYYYYYYYYY"
        date = "05 Apr"
        stared = true
        unread = true
    },
    email {
        user = "Your mother"
        subject = "You will broke the TV"
        preview = "I think I'm read mom, and not Grandma, hehe"
        date = "15 May"
        stared = false
    }

)