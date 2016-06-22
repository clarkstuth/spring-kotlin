package com.clarkstuth.kotlin.spring.test

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScheduledRunner : Runnable {

    @Scheduled(fixedDelay = 5000)
    override fun run() {
        println("Running on fixed schedule.")
    }

}