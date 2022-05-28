package com.fastcampus.fastcamplusspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloWorldApplication

fun main(args: Array<String>) {
	runApplication<HelloWorldApplication>(*args)
}


@RestController
class HelloController {

	@GetMapping("/")
	fun sayHello() = "Hello, World"
}
