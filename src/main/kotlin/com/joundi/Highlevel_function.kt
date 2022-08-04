package com.joundi

fun main() {
    var program = fibo()
//    program.fibonacci(6)
    var total = 0;
    //anonymous Class
//    program.fibonacci(6, object :Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//
//    })
    //lambda

//    program.fibonacci(6) { n -> println(n) }
//    program.fibonacci(6) {println(it)}
    // :: Pass by reference in this case function reference
    program.fibonacci(6, ::println)
    //lambda can mutate values
    program.fibonacci(6) {it -> total += it}
    println("Total is $total")

    //A closure is a special kind of object that combines two things:
    // a function, and the environment in which that function was created.
    //a closure function has access to the variables and parameters defined in the outer scope.
    var sum=0
    var listOfInteger= arrayOf (0, 1, 2, 3, 4, 5, 6, 7)
    listOfInteger.forEach {
        sum+=it
    }
    println ("Closure example $sum")
}

interface Process {
    fun execute(value: Int)
}

class fibo {

    //Unit is void in Kotlin
    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0;
        var prevprev = 0;
        var current = 1;

        for (i in 1..limit){
            action(current)

            var temp = current;
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process){
        var prev = 0;
        var prevprev = 0;
        var current = 1;

        for (i in 1..limit){
            action.execute(current)

            var temp = current;
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int){
        var prev = 0;
        var prevprev = 0;
        var current = 1;

        for (i in 1..limit){
            println(current)

            var temp = current;
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}