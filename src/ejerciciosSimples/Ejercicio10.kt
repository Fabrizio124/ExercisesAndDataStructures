package ejerciciosSimples

fun main(){
    val payasosPeso = 112
    val muñecasPeso = 75
    println("Introduce el numero de payasos a enviar: ")
    var payaso = readLine()!!.toInt()
    println("Introduce el numero de muñecas a enviar: ")
    var muñecas = readLine()!!.toInt()
    var pesoTotal = payasosPeso * payaso + muñecasPeso * muñecas
    println("EL peso total del paquete es: $pesoTotal")
}