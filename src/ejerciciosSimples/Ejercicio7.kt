package ejerciciosSimples
//SACA LA MASA CORPORAL

fun main(){

   println("¿Cual es tu peso?")
   var peso = readLine()!!.toInt()
   println("¿Cual es su estatura?")
   var estatura =  readLine()!!.toFloat()
   var totalEstatura = estatura * estatura
     var imc =  peso / totalEstatura
     var indiceMasa =  String.format("%.2f", imc)
   println("Tu índice de masa corporal es: \n$indiceMasa")

}