fun main() {
    val str = "A:B:C"
    val delim = ":"

    val list = str.split(delim)

    println(list)    // [A, B, C]
}