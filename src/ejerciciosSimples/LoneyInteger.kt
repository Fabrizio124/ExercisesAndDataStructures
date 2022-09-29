package ejerciciosSimples

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    var counter = 0
    var secondArray = a

   if(a.size == 1){
       return 1
   }
   for(element in a){
       for (secElement in secondArray){
            if (element == secElement){
               
            }
       }
   }

    return  counter
}

fun main (){
  println(lonelyinteger(arrayOf(0,0,1,2,1)))
}