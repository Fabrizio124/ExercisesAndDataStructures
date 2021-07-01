package ejerciciosSimples

fun main(){
  println("Escriba dos numeros")
  var n =  readLine()!!.toInt()
  var m =   readLine()!!.toInt()
  var r = n % m
  var c = n / m

    println("El residuo de los dos numeros es: $r")
    println("EL cociente de los dos numeros es: $c")
}