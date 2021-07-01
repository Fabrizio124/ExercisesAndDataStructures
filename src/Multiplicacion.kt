fun smallEnough(a : IntArray, limit : Int): Boolean {
   for (index in 0..a.size-1) {
      if(a[index] >= limit  ){
         return false
      }
   }
  return true
}


fun main(){
   println(smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))
   println("----------------------")
   println(smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))
}