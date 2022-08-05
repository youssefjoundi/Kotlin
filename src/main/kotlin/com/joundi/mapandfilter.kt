package com.joundi

// Collections
// filter and map functions
// filter is similar to where in sql
// map is similar to select

fun main() {
    val ints = listOf(1,2,3,4,5)

    val smallints = ints.filter { it < 5 }

    for (i in smallints) println(i)

    val squaredInts = ints.map { it*it }

    for (i in squaredInts) println(i)

    val  smallSquareInts = ints.
                            filter { it < 5}.
                            map { it * it }

    for (i in smallSquareInts) println(i)

    val meetings = listOf(Meetings(1, "First Meeting"), Meetings(2, "Second Meeting"))

    val titles = meetings
                .filter { it -> it.title.startsWith("F") }
                .map { m ->m.title }

    for (t in titles) println(t)


}

class Meetings(val id:Int, val title:String){

}