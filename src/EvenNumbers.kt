// Just because the challenge says "array" does not mean we should use a Kotlin Array...
fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    var newArray : MutableList<Int> = mutableListOf()
    var limite = array.size-1

    while(limite >= 0) {
        if (array[limite] % 2 == 0) {
           // println(array[i])
        newArray.add(array[limite])

            if( newArray.size == number){

               break
            }
        }
        limite--
    } 
   var res=  newArray.asReversed()

    return res
}

fun main() {
    println(evenNumbers(listOf(6, -25, 3, 7, 5, 5, 7, -3, 23), 1))
}