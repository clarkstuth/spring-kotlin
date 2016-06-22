package com.clarkstuth.kotlin.spring.test

import org.springframework.stereotype.Component

@Component
class HelloImpl {

    fun sayHello() {
        println("Hello!")
    }

}