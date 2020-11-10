package firstpackage

fun main(args: Array<String>) {

    val language = if (args.size == 0) "EN" else args[0]
    val say = when (language) {
        "EN" -> "Hello!",
        "FR" -> "Salut!",
        "IT" -> "Ciao!"
        else -> "Sorry, I can't great you in $language yet"
    }
    println(say)
}