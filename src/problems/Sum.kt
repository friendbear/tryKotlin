package problems

fun sum(values: IntArray): Int{
    var acc: Int = 0
    return values.foldRight(0){ i, acc -> i + acc }
}