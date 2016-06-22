package com.clarkstuth.kotlin.spring.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HelloService @Autowired constructor(val helloImpl: HelloImpl) {

    fun execute() {
        helloImpl.sayHello()
    }

}