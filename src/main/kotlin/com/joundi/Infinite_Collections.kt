package com.joundi

// Problems with lists :
// * Functions such as filter and map create lists
// * Fine if lists are small
// * Not good if lists are massive
// Instead use Sequences

fun main() {
    val Schools = listOf(School(1, "Kamel"), School(2, "Teragel"))

    var names = Schools
        .asSequence()
        .filter { println("filer ($it)");it.name.endsWith("l") }
        .map { println("map ($it"); it.name }

    for (t in names) println(t)
}


class School(val id: Int, var name: String) {
    val teachers = listOf(Teacher("Ahmed"), Teacher("Mohamed"))


}

data class Teacher(val name: String) {

}