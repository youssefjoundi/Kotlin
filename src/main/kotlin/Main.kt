import com.joundi.Language
import com.joundi.Name
import com.joundi.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val youssef = Person()

    youssef.Name = "Joundi"

    println("My Name is ${youssef.Name}")

    val user = Name("yojoundi")


    println("This my username : ${user.UserName}")

    user.UserName = "youssefjoundi"

    println("My github username : ${user.UserName}")

    val language = Language("Kotlin")

    language.display()

    language.displayWithLamda(::printLanguage)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")
}

fun printLanguage(pLanguage: String){
    println(pLanguage)
}