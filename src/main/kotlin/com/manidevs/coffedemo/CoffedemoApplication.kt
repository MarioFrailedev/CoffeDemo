package com.manidevs.coffedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoffedemoApplication

fun main(args: Array<String>) {
    runApplication<CoffedemoApplication>(*args)
}
