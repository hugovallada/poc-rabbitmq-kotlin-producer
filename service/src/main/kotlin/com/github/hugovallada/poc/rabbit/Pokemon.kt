package com.github.hugovallada.poc.rabbit


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiModuleProjectApplication

fun main(args: Array<String>) {
	runApplication<MultiModuleProjectApplication>(*args)
}
