package cadenas

fun main(){
    println("Cual es el precio del producto?")
    var precio = readLine()!!.toString()
    var punto = precio.split(".")
    println("El numero de euros es: ${punto[0]}")
    println("El numero de centimos es: ${punto[1]}")
}