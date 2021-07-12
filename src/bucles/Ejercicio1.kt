package bucles

fun main(){
    println("Cual es tu nombre")
    var nombre = readLine()!!.toString()
    for (i in 1..10){
        println(nombre)
    }
}