package com.joundi

import java.math.BigInteger

fun max(a: Int, b: Int) : Int = if (a > b) a else b

fun display(message :String) : Boolean{
    println(message)
    return true
}

fun main() {
    display("Yojoundi")
    println(max(1 ,2))
    log("Kotlin ")
    log("Kotlin ", 2)
    namedParameters(name = "Youssef ", age = 24)
    val test = "with    multiple   \t   last  "
    println(replaceWhiteSpace(test))
    println(test.replaceWhiteSpaceEx())

    val h1 = Header("H1 ")
    val h2 = Header("H2")

    val h3 = h1 plus h2

    println(h3.Name)

    val hp1 = Headerp("HP1 ")
    val hp2 = Headerp("HP2")

    val hp3 = hp1 + hp2

    println(hp3.Name)
    println(fib(10000, BigInteger("1"), BigInteger("0")))

}
// Default Parameter

fun log(name :String, level : Int = 1){
    println(name + level)
}
// Named Paramaters

fun namedParameters(name: String, age : Int){
    println(name + age)
}
fun replaceWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

//Extension Function (has single parameter

fun String.replaceWhiteSpaceEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

// Infix Function

class Header(var Name: String){
}

infix fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}

// Overloaded Operator
class Headerp(var Name: String){
}

infix operator fun Headerp.plus(other: Headerp) : Headerp {
    return Headerp(this.Name + other.Name)
}

// Tail Recursive Function
tailrec fun fib(n : Int, a : BigInteger, b : BigInteger) : BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}

