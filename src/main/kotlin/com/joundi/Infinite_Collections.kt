package com.joundi

// Problems with lists :
// * Functions such as filter and map create lists
// * Fine if lists are small
// * Not good if lists are massive
// Instead use Sequences
// Sequence are lazily evaluated
// Evalutation startss when using terminal operation

fun iter(seq: Sequence<String>) {
    for (t in seq) println(t)
}

fun main() {
    val Schools = listOf(School(1, "Kamel"), School(2, "Teragel"))

    var names = Schools
        .asSequence()
        .filter { println("filer ($it)");it.name.endsWith("l") }
        .map { println("map ($it)"); it.name }

    iter(names)
//    for (t in names) println(t)
    println("**********************************")
    val s_name = Schools
        .asSequence()
        .map { println("map : $it");it.name.toUpperCase() }
        .find { it.startsWith("KAMEL") }

    println(s_name)
}


class School(val id: Int, var name: String) {
    val teachers = listOf(Teacher("Ahmed"), Teacher("Mohamed"))


}

data class Teacher(val name: String) {

}