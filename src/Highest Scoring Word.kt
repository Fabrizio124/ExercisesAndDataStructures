fun high(str: String): String {
    val arr = str.split(" ")
    var max = 0
    var maxWord = ""

    for (elem in arr) {
        var current = 0
        println(elem)
        for (x in elem) {
            current += x.toInt() - 96
        }

        println(current)
        if (current > max) {
            max = current
            maxWord = elem
        }
    }

    return maxWord
}

fun main(){
    println(high("take me to semynak"))
}