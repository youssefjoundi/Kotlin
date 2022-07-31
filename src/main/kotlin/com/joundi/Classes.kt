package com.joundi

// Classes is final and public by default
// open make class available for the inheritance and also for method and setters and setters
// abstract Class any method abstracted in abstract class must be overrided in the child class

// data class

data class event(var meeting:String, var location: String){

}

fun main() {
    val yojoundi = Student(1, "Youssef", "Joundi", "Some tutor")
    println(yojoundi.id)
    val first = event("Tech", "Casablanca")
    val second = event("Commercial", "Marrakech")

    if (first == second){
        println("the same")
    } else {
        println("Different")
    }
    println(first)
    println(second)
    var otherOne = first.copy(location = "Tanger")
    print(otherOne)
}

abstract class Info(var firtName: String, var lastName: String) {

    open fun getfullName () : String = "$firtName $lastName"
    abstract fun getAddress():String
}

class Student(_id:Int, firtName: String, lastName: String) : Info(firtName, lastName) {
    val id : Int
    var tutor:String
    init {
        id = _id
        tutor = ""
    }
    constructor(_id:Int,firtName: String, lastName: String, tutor:String) : this(_id, firtName, lastName){
        this.tutor = tutor
    }
    override fun getfullName() : String {
        return ""
    }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }
}

// Sealed Classes

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}


