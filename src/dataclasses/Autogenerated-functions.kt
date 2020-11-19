package dataclasses

data class User2(val name: String, val id: Int)

fun main(args: Array<String>) :Unit{
    val user = User2("Jone", 2)

    println(user)

    val secondUser = User2("Jone", 2)
    val thirdUser = User2("Jessy", 3)
    println("equal check is ${user == secondUser}")
    println("equal check is ${user == thirdUser}")

    // copy
    println(user.copy())
    println(user.copy(name ="Max"))
    println(user.copy(id = 2))
    println(user.copy("Max", 3))
}