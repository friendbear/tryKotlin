package syntax.multiplier

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("No number supplied")
    } else {
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        if ( x != null && y != null) {
            print(x * y)
        } else {
            println("One of the argument is null")
        }
    }

}