package com.clarkstuth.kotlin.spring.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class HelloImpl @Autowired constructor(@Qualifier("output.string") val outputString: String) {

    fun sayHello() {
        println(outputString)
    }

}