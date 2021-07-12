package bucles

fun main(){
    println("Escribe un numero entero positivo")

    var lista = listOf<Int>()
    var numero = readLine()!!.toInt()
    for(i in 0..numero){

        if(i % 2 == 1){
            lista = lista + i

        }
    }
    println(lista)
}