package condicionales

fun main(){
    println("¿Que edad tiene?")
    var edad = readLine()!!.toInt()
    var precio = when {
        edad < 4 ->  "Gratis"
        edad in 4..18 -> "5$"

        else -> "10$"
    }
    println("Usted debe de pagar $precio")
}