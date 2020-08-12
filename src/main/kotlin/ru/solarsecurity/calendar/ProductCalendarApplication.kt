package ru.solarsecurity.calendar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductCalendarApplication

fun main(args: Array<String>) {
	runApplication<ProductCalendarApplication>(*args)
}
