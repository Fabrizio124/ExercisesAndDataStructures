fun main(args: Array<String>) {

    var arr = arrayListOf(10, 5, 8 )
    var arraiResultante: MutableList<Int> = mutableListOf()

    // var arr = "repetir"
    var i = arr.size-1
    while( i >= 0  ) {
        println(arr[i])
        arraiResultante.add(arr[i])
        i--
    }


    println(arraiResultante.toString())


     println("-------------------------")
    var j=0
    while( j < arraiResultante.size  ) {
        println(arraiResultante[j]*2)
        j++
    }

}



