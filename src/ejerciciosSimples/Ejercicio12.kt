package ejerciciosSimples

fun main(){
    var panesBuenos = 3.49
    var descuento = 0.6
    println("Introduce el numero de barras vendidas que no son frescas: ")
    var cantidadpanes = readLine()!!.toInt()
    var costoPanes = panesBuenos * cantidadpanes
    var coste = costoPanes.toFloat() /100.toFloat()
    var costeFinal = costoPanes.toFloat() - coste.toFloat() * 60
    println("El coste de una barra fresca es de 3.49$")
    println("El descuento sobre una barra no fresca es 60.0%")
    val redondear = String.format("%.2f",costeFinal)
    println("El coste final a pagar es: $redondear$")
}