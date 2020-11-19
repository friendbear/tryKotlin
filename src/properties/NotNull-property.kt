package properties


import kotlin.properties.Delegates

class User3 {
    var name: String by Delegates.notNull()
    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val user = User3()
    user.init("Carl")
    println(user.name)
}