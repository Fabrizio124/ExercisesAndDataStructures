package ejerciciosSimples

fun main(){
    var coste: Int = 30
    println("¿Cuantas horas trabajo?")
    var horas = readLine()!!.toInt()
    println("El coste de hora es: ")
    println("$coste")
    println("¿Cuanta paga me corresponde?")
    val resultado = coste * horas
    println(resultado)
}