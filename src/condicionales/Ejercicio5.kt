package condicionales

fun main(){
    println("Cual es tu edad")
    var edad = readLine()!!.toInt()
    println("Cuales son tus ingresos")
    var ingresos = readLine()!!.toInt()

    if (edad > 16 && ingresos >= 1000){
        println("tiene que tributar")
    }else{
        println("no tiene que tributar")
    }
}