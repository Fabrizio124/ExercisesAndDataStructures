package ejerciciosSimples

fun getMoneySpent(keboards: Array<Int>, drivers: Array<Int>, b: Int): Int {

    var result = 0
    var max = 0

    for(element in keboards){
        for (secondElement in drivers){
           result = element + secondElement
            if (result == b ){
                return result
            }
            if (result < b && result > max ){
                  max = result
            }
        }
    }
    if (max == 0  ){
        return -1
    }


return max
}


fun main (){
    println(getMoneySpent(arrayOf(40,50,60), arrayOf(5,8,12), 60 ))
}