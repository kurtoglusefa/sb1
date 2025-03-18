package it.polito.wa2.sb1.components

import org.springframework.stereotype.Component

@Component
class DamselResquingQuest: Quest {
    override fun embark() {
        println("The damsel resists your efforts")
    }
}