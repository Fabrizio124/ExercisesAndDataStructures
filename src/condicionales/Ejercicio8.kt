package condicionales

fun main (){
    var cantidad = 2400
    println("Ingrese su puntuacion")
    var puntuacion = readLine()!!.toDouble()

    var resultado = when {
      puntuacion == 0.0 -> "Inaceptable"
      puntuacion == 0.4 -> "Aceptable"
      puntuacion >= 0.6 -> "Meritorio"

        else -> "Puntuacion incorrecta"
    }
    println("Su resultado es: $resultado")

    var final =  when {
        puntuacion == 0.0 -> puntuacion * cantidad
        puntuacion == 0.4 -> puntuacion * cantidad
        puntuacion >= 0.6 -> puntuacion * cantidad

        else -> "Error: no hay cifra"
    }
    println("Le corresponde cobrar $final$")

}