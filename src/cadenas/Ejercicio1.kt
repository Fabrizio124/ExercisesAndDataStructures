package cadenas

fun main(){
    println("¿Cual es tu nombre?")
    var nombre = readLine()!!.toString()
    println("¿Cuantas veces desea que se repita tu nombre")
    var numero =  readLine()!!.toInt()
    repeat(numero){
        println(nombre)
    }
}