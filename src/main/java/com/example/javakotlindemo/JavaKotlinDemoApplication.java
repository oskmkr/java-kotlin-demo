package com.example.javakotlindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaKotlinDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaKotlinDemoApplication.class, args);

        HelloService helloService = new HelloService();
        System.out.println(helloService.sayHello());

    }
}
