package ejerciciosSimples

fun main(hour : Array<IntRange> ){
    var a : Array<IntRange> = hour
    a = arrayOf(1..24)
    for (index in 1..a.size -1){
        if (a.size < 12){
            println("Buenos dias")
        }else{
            println("Buenas noches")
        }

    }

}


fun hola (){

}