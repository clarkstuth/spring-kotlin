package com.clarkstuth.kotlin.spring.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

fun main(args: Array<String>) {
    SpringApplication.run(Configuration::class.java)
}

@SpringBootApplication
open class Configuration {

    @Bean(name = arrayOf("output.string"))
    open fun helloString() : String {
        return "Hello!"
    }

}