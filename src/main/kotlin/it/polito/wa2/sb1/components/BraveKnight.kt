package it.polito.wa2.sb1.components

import org.springframework.stereotype.Component


@Component
class BraveKnight(private var quest: Quest) : Knight {
    override fun embarkOnQuest() {
        println("Embarking on a quest")
        quest.embark()
        println("Brave night returns to home.")
    }

    override fun afterPropertiesSet() {
        println("BraveKnight is ready to embark on a quest")

    }

    override fun destroy() {
        println("BraveKnight is going to sleep")
    }
}