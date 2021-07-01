package ejerciciosSimples

fun main() {
    val intereses = 4

    println("Ingresa la cantidad de ahorros que desea abonar: ")
    val ahorros = readLine()!!.toInt()
    var operacion = ahorros / 100.toFloat()

    var interesAño = operacion.toFloat() * intereses
    var totalAño = interesAño + ahorros
    println("La cantidad total de 1 es de: $totalAño")

    for (i in 2..10){

        operacion = totalAño / 100.toFloat()
        interesAño = operacion.toFloat() * intereses
        totalAño = interesAño.toFloat() + totalAño.toFloat()
        val redondear = String.format("%.2f",totalAño)
        println("La cantidad total de $i es de: ${redondear.toFloat()}")

    }
}