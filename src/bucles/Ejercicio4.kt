package bucles

fun main(){
    println("Escribe un numero entero")
    var resultado = listOf<Int>()

    var numero = readLine()!!.toInt()
    var nuevo = numero
    nuevo.toInt()

        while(nuevo >= 0) {

            resultado = resultado + nuevo
            nuevo--
        }
    println(resultado)
}