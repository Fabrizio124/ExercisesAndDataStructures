package listasYduplas

fun main(){
   var alphabet = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
   var nuevo =  listOf<String>()
    for(i in 1..alphabet.size -1){

           if (i % 3 != 0  ){
               println(i)
            nuevo = nuevo + alphabet[i-1]
           }
    }
    println(nuevo)
}
