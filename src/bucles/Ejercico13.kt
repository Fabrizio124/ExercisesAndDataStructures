package bucles

fun main(){
    println("Intruce algo")
    var salir = "salir"
    var eco = readLine()!!.toString()
    while (eco != salir){
        println(eco)
        println("Acceso no permitido, salga del programa")
        eco = readLine()!!.toString()

    }
}