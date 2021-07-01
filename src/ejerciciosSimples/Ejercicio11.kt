package ejerciciosSimples

fun main(){
    var intereses = 4
    println("Ingresa la cantidad de ahorros que desea abonar: ")
    var ahorrros = readLine()!!.toInt()
    var operacion =  ahorrros / 100.toFloat()
    //println(operacion)
    var primerAño = operacion.toFloat()  * intereses + ahorrros

    println("Su ahorro total en el primer año sera: ${primerAño.toFloat()}")

    var segundaOperacion = primerAño/ 100.toFloat()
    var segundoAño = segundaOperacion.toFloat() * intereses  + primerAño
    println("Su ahorro total en el segundo año sera: ${segundoAño.toFloat()}")

    var terceraOperacion = segundoAño/ 100.toFloat()
    var tercerAño = terceraOperacion.toFloat() * intereses  + segundoAño
    println("Su ahorro total en el tercer año sera: ${tercerAño.toFloat()}")


}