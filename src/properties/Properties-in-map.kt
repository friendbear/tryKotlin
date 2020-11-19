package properties

class User4(val map:Map<String, Any?>) {
    val name: String by map
    val age:Int by map
}

fun main(args: Array<String>) {
    val user = User4(mapOf(
        "name" to "John",
        "age" to 25
    ))

    println("name=${user.name}, age=${user.age}")
}