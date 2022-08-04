package com.joundi

import java.util.Date

class Meeting {
    var Title:String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main() {
   val m = Meeting()
    m.Title = "Board meeting"
    m.When = Date(2022,8,1)
    m.Who.add("Jozef")

   //with is used to access an object's members and methods
    // without having to refer to the object once per access.
    with(m){
        Title = "Event 1"
        When = Date(2022,8,1)
        Who.add("Jozef")
    }
    //apply in method take lambda
    //Kotlin apply is an extension function on a type
    m.apply {
        Title = "Event 2"
        When = Date(2022,8,1)
        Who.add("Jozef")
    }.create()
    println("Title is : ${m.Title}")
}