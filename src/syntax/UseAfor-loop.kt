package syntax

fun main(args: Array<String>) {
    for (arg in args)
        println(arg)

    println()
    for (i in args.indices)
        println(args[i])
}