fun highAndLow(numbers:  String): String {
    // ...
  val newArray = numbers.split(" ")

    var arraiResultante: MutableList<Int> = mutableListOf()

    for (elemento in newArray) {
     arraiResultante.add(elemento.toInt())

    }

    val max = arraiResultante.maxOrNull()
    val min = arraiResultante.minOrNull()

    return ( "$max $min")

}

fun main(){
    println( highAndLow ("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}