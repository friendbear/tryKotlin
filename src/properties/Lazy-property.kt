package properties

class LazySample {
    val lazy: String by lazy{
        println("lazy val computed!")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample();
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}