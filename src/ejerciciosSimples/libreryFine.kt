package ejerciciosSimples

fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    // Write your code here
    var daysLate = 15
    var monthslate = 500
    var yearLate = 10000

    var penalty = 0

    if (y1 < y2){
        return penalty
    }
    if(y1 == y2){
       penalty = 0
    }  else if (y1 > y2){
        penalty = y1 - y2
        penalty = penalty * yearLate
         return (penalty)
    }

    if(m1 == m2){
        penalty = 0
    }  else if (m1 > m2){
        penalty = m1 - m2
        penalty = penalty * monthslate
        return (penalty)
    } else {
        return penalty
    }

    if(d1 == d2){
       penalty = 0
    }  else if (d1 > d2){
        penalty = d1 - d2
        penalty = penalty * daysLate
        return (penalty)
    } else {
        penalty = 0
    }

    return  penalty
}

fun main(){
    println(libraryFine(9,6,2015, 6,4,2015))
}

