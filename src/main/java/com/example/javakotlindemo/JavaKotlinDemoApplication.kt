package com.example.javakotlindemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object JavaKotlinDemoApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(JavaKotlinDemoApplication::class.java, *args)
        val helloService = HelloService()
        println(helloService.sayHello())
    }
}