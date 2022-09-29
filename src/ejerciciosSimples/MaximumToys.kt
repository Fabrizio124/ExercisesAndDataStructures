package ejerciciosSimples


fun maximumToys(prices: Array<Int>, k: Int): Int {
    // Write your code here
    var counter = 0
    var sum = 0

    for (element in prices){
        if (element < k){
            counter = counter  + 1
           // println(counter)
            sum  = sum + element
           // println(sum)
            if (sum > k){
                counter = counter - 1
                break
            }
        }

        if (element == k){
            return 1
        }
    }



   return counter
}


fun main(){
    println(maximumToys(arrayOf(1,2,3,4,5),11))

}