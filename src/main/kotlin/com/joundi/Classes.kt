package com.joundi

// Classes is final and public by default
// open make class available for the inheritance and also for method and setters and setters
// abstract Class any method abstracted in abstract class must be overrided in the child class

// data class

data class event(var meeting: String, var location: String) {

}

fun main() {
    val yojoundi = Student(1, "Youssef", "Joundi", "Some tutor")
    println(yojoundi.id)
    val first = event("Tech", "Casablanca")
    val second = event("Commercial", "Marrakech")

    Student.createUdergrad("Test")
    Student.createPostgrad("Hiver")

    if (first == second) {
        println("the same")
    } else {
        println("Different")
    }
    println(first)
    println(second)
    var otherOne = first.copy(location = "Tanger")
    print(otherOne)
}

class Program {

    companion object {
        @JvmStatic
        fun main() {
            val yojoundi = Student(1, "Youssef", "Joundi", "Some tutor")
            println(yojoundi.id)
            val first = event("Tech", "Casablanca")
            val second = event("Commercial", "Marrakech")

            Student.createUdergrad("Test")
            Student.createPostgrad("Hiver")

            if (first == second) {
                println("the same")
            } else {
                println("Different")
            }
            println(first)
            println(second)
            var otherOne = first.copy(location = "Tanger")
            print(otherOne)
            println("**********************")
        }
    }
}

abstract class Info(var firtName: String, var lastName: String) {

    open fun getfullName(): String = "$firtName $lastName"
    abstract fun getAddress(): String
}

open class Student(_id: Int, firtName: String, lastName: String) : Info(firtName, lastName) {
    val id: Int
    var tutor: String

    init {
        id = _id
        tutor = ""
    }

    constructor(_id: Int, firtName: String, lastName: String, tutor: String) : this(_id, firtName, lastName) {
        this.tutor = tutor
    }

    override fun getfullName(): String {
        return ""
    }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

    // emplementation of object
    fun enrole(courseName: String) {
        val course = courses.allcourses
            .filter { it.title == courseName }
            .firstOrNull()
    }

    // Companion method
    companion object : XmlSerializer<Student> {
        fun createUdergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
    }


}

interface XmlSerializer<T> {
    fun toXml(item: T)
}

class Undergraduate(firtName: String) : Student(1, firtName, "") {

}

class Postgraduate(firtName: String) : Student(1, firtName, "") {

}
// Sealed Classes

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}


