package com.joundi


class Person {
    var Name: String = ""
}

//Class with Construtor
class Name (var UserName : String){
}

//Class with function or member function or method
class Language(var Planguage: String){
    fun display(){
        println("The programing language enter is ${Planguage}")
    }

    //Lambda | high order function
    fun displayWithLamda(func: (s:String) -> Unit){
        func(Planguage)
    }
}