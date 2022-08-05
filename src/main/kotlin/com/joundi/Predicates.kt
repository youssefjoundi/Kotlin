package com.joundi

fun main() {
    val ints = listOf(1,2,3,4,5)

    val greaterThanThree = {v : Int -> v > 3 }

    var largeInts = ints.all { it > 3 }

    println(largeInts)

    largeInts = ints.any (greaterThanThree)

    println(largeInts)

    var numberOfLargInts = ints.count{it > 3 }
    println(numberOfLargInts)

    var found = ints.find{it > 6}

    println(found)
}