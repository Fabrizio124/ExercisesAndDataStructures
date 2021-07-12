package bucles

fun main(){
    println("Cuanto desea invertir?")
    var invertir = readLine()!!.toInt()
    println("Cual es su interes?")
    var interes = readLine()!!.toInt()
    println("Cuantos años?")
    var años = readLine()!!.toInt()

    var operacion = invertir / 100

    var interesAño = operacion * interes
    var totalAño = interesAño + invertir
    println("La cantidad total de 1 es de: $totalAño")

    for (i in 2..años){

        operacion = totalAño / 100
        interesAño = operacion * interes
        totalAño = interesAño + totalAño

        println("La cantidad total de $i es de: $totalAño")
    }
}