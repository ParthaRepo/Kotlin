package com.partharepo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RestfulServiceMain {
    fun main(args: Array<String>){
        SpringApplication.run(RestfulServiceMain::class.java, *args)
    }
}