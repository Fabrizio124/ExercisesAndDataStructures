package ejerciciosSimples

fun main(){
    println("Introduce un número entero: ")
    val n = readLine()!!.toInt()

    var resultado = (n*(n+1)/2)
    println("La suma de los primeros números enteros desde 1 hasta $n es $resultado ")
}