package com.joundi

fun main() {
    display("Yojoundi")
    println(max(1 ,2))
    log("Kotlin ")
    log("Kotlin ", 2)

}

fun max(a: Int, b: Int) : Int = if (a > b) a else b

fun display(message :String) : Boolean{
    println(message)
    return true
}

// Default Parameter

fun log(name :String, level : Int = 1){
    println(name + level)
}