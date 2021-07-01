
fun sumParts(ls: IntArray): ArrayList<Int> {
   val numeros: ArrayList<Int> = arrayListOf()
   var sumar = 0
   for (i in 0..ls.size-1){
      for(j in i..ls.size-1) {
         sumar += ls[j]
      }
      numeros.add(sumar)
      sumar = 0

   }
   numeros.add(0)
   return numeros
}

fun main() {
    println(sumParts(intArrayOf(0, 1, 3, 6, 10)))
}