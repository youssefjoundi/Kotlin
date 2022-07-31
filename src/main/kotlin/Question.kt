import java.io.FileReader
import java.io.IOException
import java.util.TreeMap

fun main() {
    println("Hello World")

    val q = Question()
    q.answer = "Test"
//    q.Question = "can't change" //mutubale
    q.display()

    val message = if (q.answer == q.correctAnswer){
        "Kayn"
    } else {
        "makaynch"
    }
    println(message)

    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException){
        null
    }
    println("Number is $number")
    for (i in 1 until 10){
        println(i)
    }
    println("---------.. Range---------------")
    for (i in 1 .. 10){
        println(i)
    }
    var a = 'a'..'z'
    for (i in a){
        println(i)
    }
    println("---------Downto-------------")
    for (i in 10 downTo 0) {
        println(i)
    }
    println("----------Step-------------")
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
    println("---------List-----------")
    var numbers = listOf<Int>(1,2,3,4,5)
    for (i in numbers){
        println(i)
    }
    println("---------TreeMap-----------")
    var ages = TreeMap<String, Int>()
    ages["Cactus"] = 25
    ages["hed"] = 23
    ages["me"] = 24
    ages["haitam"] = 20
    for ((name,age) in ages){
        println("$name has $age years old")
    }
    println("---------Index-----------")
    for ((index, element) in numbers.withIndex()){
        println("$element is $index")
    }

    var reader = FileReader("/Users/yojoundi/Desktop/Kotlin_Concepts/build.gradle.kts")
    try {
        reader.read()
    } catch (e : IOException) {

    } finally {

    }
    println(reader)
}

class Question {
    var answer:String = ""
    val correctAnswer = "Test2"
//    val Question = "What is this ?"
    fun display(){
        println("My answer is " + answer)
    }

    fun printResult() {
        when (answer) {
            correctAnswer -> {
                println("{kayn}")
            }
            else -> {
                println("{makaynch}")
            }
        }
    }
}

