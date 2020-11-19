package basic

fun main(args: Array<String>) {

    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for ((k, v) in map) {
        println("key = $k, value = $v")
    }
}
