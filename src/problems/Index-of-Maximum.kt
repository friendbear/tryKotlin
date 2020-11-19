package problems

fun indexOfMax2(array: IntArray) :Int? {

    var max: Int = 0
    var index: Int = 0
    var maxIndex: Int? = null
    for (item in array) {

        if (maxIndex == null) {
            max = item;
            maxIndex = index
        } else {
            if (max < item) {
                max = item
                maxIndex = index
            }
        }
        index++
    }
    return maxIndex
}
fun main(args: Array<String>) {

    println("index=${indexOfMax(intArrayOf(-1,0))}")

}
fun indexOfMax(array: IntArray): Int? {
    var max: Int = 0;
    var maxIndex: Int? = null

    array.toList().forEachIndexed{i, x ->
        if (maxIndex == null || max < x) {
            maxIndex = i
            max = x
        }
    }
    return maxIndex
}