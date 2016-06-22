package com.clarkstuth.kotlin.spring.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

@Component
open class HelloRunner @Autowired constructor(val helloService: HelloService) : CommandLineRunner, ApplicationContextAware {

    internal lateinit var applicationContext: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    override fun run(vararg args: String?) {
        helloService.execute()
        SpringApplication.exit(applicationContext)
    }
}