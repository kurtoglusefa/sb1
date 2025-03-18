package it.polito.wa2.sb1.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long = 0L

    var name:String = ""
    var age:Int = 0
}