package com.example.cloudplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class CloudplaygroundApplication

fun main(args: Array<String>) {
	runApplication<CloudplaygroundApplication>(*args)
}

@RestController
class MyController {

	@GetMapping("/")
	fun home(): String {
		return "hello world"
	}
}