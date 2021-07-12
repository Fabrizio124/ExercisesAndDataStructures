package listasYduplas

fun main (){

   var lista = listOf<Int>()
   for(i in 1..6){
      println("Introduce un número ganador")
       var numero = readLine()!!.toInt()
       lista = lista + numero


   }
    println(lista.sorted())
}