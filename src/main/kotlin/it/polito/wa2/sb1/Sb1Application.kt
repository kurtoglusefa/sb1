package it.polito.wa2.sb1

import it.polito.wa2.sb1.components.Knight
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Sb1Application{
	@Bean
	fun testBehavior(knight: Knight): CommandLineRunner = CommandLineRunner {
		knight.embarkOnQuest()
	}
}

fun main(args: Array<String>) {
	val ctx = runApplication<Sb1Application>(*args)
	println("Total beans built: " + ctx.beanDefinitionCount)
}

