package com.joundi

//let takes the object it is invoked upon as the parameter and returns
//the result of the lambda expression.
//Kotlin let is a scoping function wherein the variables declared inside
//the expression cannot be used outside.



fun main() {
//    it keyword contains the copy of the property inside let.
//    The last value from the let is returned as an argument as shown below.
    var str = "Hello World"
    str.let { println("$it!!") }
    println(str)
    var strLength = str.let { "$it function".length }
    println("strLength is $strLength")
//    Nesting let
//    For nested let, we can’t use it keyword. We need to assign explicit names to it in both the let functions.
//    Only the outermost let returns the value as shown below.
    var x = "Anupam"
    x.let { outer -> outer.let { inner -> println("Inner is $inner and outer is $outer") } }
    //******************************************************************//
//    Kotlin run expression can change the outer property.
//    Hence in the above code, we’ve redefined it for the local scope.
//    Similar to the let function, the run function also returns the last statement.
//    Unlike let, the run function doesn’t support the it keyword.
    var tutorial = "This is Kotlin Tutorial"
    println(tutorial) //This is Kotlin Tutorial
    tutorial = run {
        val tutorial = "This is run function"
        tutorial
    }
    println(tutorial)
//    let end run
    var p : String? = null
    p?.let { println("p is $p") } ?: run {
        print("p was null. Setting default value to: ")
        p = "Kotlin"
    }
    println(p)
    //******************************************************************//
    //let and also
    data class Person(var name: String, var tutorial : String)
    var person = Person("Anupam", "Kotlin")

    var l = person.let { it.tutorial = "Android" }
    var al = person.also { it.tutorial = "Android" }

    println(l)
    println(al)
    println(person)
//    In the above code, we’ve used Data classes.
//    The also expression returns the data class object whereas the let expression
//    returns nothing (Unit) as we didn’t specify anything explicitly.


}