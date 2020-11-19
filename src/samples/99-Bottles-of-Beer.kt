package samples

import java.lang.NumberFormatException

fun printBottles(bottleCount: Int) :Unit {
    if (bottleCount <= 0) {
        println("No bottles - no song")
        return
    }

    println("The \"${bottlesOfBeer(bottleCount)}\"song\n")

    var bottles = bottleCount
    while (bottles > 0) {
        val bottlesOfBeer = bottlesOfBeer(bottles)
        print("$bottlesOfBeer on the wall, $bottlesOfBeer.")
        bottles--
        println("${bottlesOfBeer(bottles)} on the wall.\n")
    }
}
fun bottlesOfBeer(count: Int): String =
    when(count) {
        0 -> "no more bottles"
        1 -> "1 bottle"
        else -> "$count bottles"
    } + " of beer"

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printBottles(99)
    } else {
        try {

            printBottles(args[0].toInt())
        } catch (e: NumberFormatException) {
            println("You have passed'${args[0]}' as a numberof bottles," +
                    "but it is not a valid integer number")
        }
    }
}