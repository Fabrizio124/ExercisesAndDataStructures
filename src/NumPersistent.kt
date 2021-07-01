fun persistence(num: Int) : Int {

    var s = num.toString().map { it.toString() }.toTypedArray()
    var contador = 0

    if (s.size == 1 ){
        return 0
    } else {
        var tam  = s.size
        var result = 1
        while (tam > 1){
            for (i in 0..tam-1) {
                result = result * s[i].toInt()
            }
               s = result.toString().map { it.toString() }.toTypedArray()
               tam  = s.size
               result = 1
               contador++
           }
        }

    return contador
}

fun main (){
    println(persistence(39))
    println("-------------")
   // println(persistence(4))
    println("-------------")
   // println(persistence(25))
    println("-------------")
   // println(persistence(1221))
}

