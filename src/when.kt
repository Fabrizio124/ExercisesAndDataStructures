fun main() {
    println(queMesEs(5))
}

fun queMesEs(mes:Int):String {
    return when(mes){
    1 -> "Enero"
    2 -> "Febrero"
    3 -> "Marzo"
    4 -> "Abril"
    5 -> "Mayo"
    6 -> "Junio"
    7 -> "Julio"
    8 -> "Agosto"
    9 -> "Septiembre"
    10 -> "Octubre"
    11 -> "Nobiembre"
    12 -> "Diciembre"
    else -> "No es un mes valid"
   }
}