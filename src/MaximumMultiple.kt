fun maxMultiple(d: Int, b: Int): Int {

    var n = b
    while (n >= 0 && n >= d) {
     if(n % d == 0){

         return  n

     }

        n = n-1

    }
    return n
}

fun main(){
    println(maxMultiple(37, 200))
}