package com.joundi

class Events(val id: Int, val title: String) {
    val people = listOf(celebrity("Sam"), celebrity("Adam"))
}

data class celebrity(val name: String) {

}

fun main() {
    val events_t = listOf(Events(1, "Tennis Table match"), Events(2, "Dance"))

    val people = events_t
        .flatMap(Events::people)
        .distinct()
    for (p in people) println(p.name)
}