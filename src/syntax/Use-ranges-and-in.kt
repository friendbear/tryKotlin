package syntax

fun main(args: Array<String>) {
    val x = args[0].toInt()

    val y = 10
    if (x in 1..y-1)
        println("OK")

    for (a in 1..5)
        print("$a ")

    println()
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size-1)
        println("Out: array has only ${array.size} elements. x: ${x}")

    if ("aaa" in array)
        println("Yes: array contains aaa")

    if ("ddd" in array)
        println("Yes: array contains ddd")
    else
        println("No: array dosn't contains ddd")
}