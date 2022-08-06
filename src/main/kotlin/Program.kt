fun main() {
    var user = User("Kevin")
    // when create lamda as var and passit to method it much be between ()
    var count = 0

    // SamConstructors
//    var evenListener = { u: User -> println("User $u has been created: ${++count} times") }
    var evenListener = created { println("User $it has been created: ${++count} times") }


    user.create(evenListener)

    user.create { println("User $it has been created: ${++count} times") }
}