package condicionales

fun main(){
    println("¿Cual es su renta anual?")
    var renta = readLine()!!.toInt()

    val result = when {

        renta < 10000 -> 5
        renta in 10000..19999 -> 15
        renta in 20000..34999 -> 20
        renta in 35000..59000 -> 30
        else -> 45
    }
    println("Su porcentaje que le corresponde pagar es: $result%")

    println("Su porcentaje de la renta anual es:  ")

    var total = renta / 100  * result
    println(total)

}