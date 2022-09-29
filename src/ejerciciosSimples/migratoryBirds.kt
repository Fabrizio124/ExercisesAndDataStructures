package ejerciciosSimples

fun migratoryBirds(arr: Array<Int>): Int{

    var secondArray = arrayOf<Int>(1,2,3,4,5)
    var counter = 0
    var elementGoal = 0
    var counterMax = 0


    for(element in secondArray) {
        for (secElemnt in arr) {
            if (element == secElemnt) {
                counter = counter + 1

            }
        }
       if (counter > 1 ){
           if(counter > counterMax){
               counterMax =  counter
               elementGoal = element
           } else if(counterMax == counter && element < elementGoal ) {
                elementGoal = element
           }
       }
        counter = 0
    }



    return elementGoal
}

fun main(){
    println(migratoryBirds(arrayOf(1, 1, 2,  2, 3)))
}