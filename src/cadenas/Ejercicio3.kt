package cadenas

fun main(){
    println("¿Cual es tu nombre?")
    var nombre = readLine()!!.toString()

    nombre.length
    println("Su nombre ${nombre.uppercase()} tiene la cantidad de ${nombre.length} letras ")
}