package com.joundi

// Kotlin don't have static method
// kotlin have singletons
// We use Companion object to get statics in Kotlin
// we use object keyword to create a singleton and actually defines a class and create an instance
// objects can have properties, methods, initializers
// objects cannot have constructors
// Objects can derive from other classes or interfaces
// Objects can be used where any instance is used
// objects can be declared inside another class (Nested object)
// Companion Objects is used for Factory objects and static members

class course(val id : Int, val title:String) {

}

object courses {
    var allcourses = arrayListOf<course>()

    fun initialize(){
        allcourses.add(course(1, "Kotlin"))
        allcourses.add(course(2, "Android"))
        allcourses.add(course(3, "Android Studio"))
    }
}