package com.clarkstuth.kotlin.spring.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

fun main(args: Array<String>) {
    SpringApplication.run(Configuration::class.java)
}

@SpringBootApplication
@EnableScheduling
open class Configuration {

    @Bean(name = arrayOf("output.string"))
    open fun helloString() : String {
        return "Hello!"
    }

}