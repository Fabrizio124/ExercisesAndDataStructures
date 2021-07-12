package condicionales

fun main(){
    println("Introduce un numero entero")
    var numero = readLine()!!.toInt()

    if(numero % 2 == 0) {
        println("Es par")
    }else{
        println("Es impar")
    }
}