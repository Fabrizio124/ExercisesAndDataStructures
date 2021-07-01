fun findDuplicates(arr:IntArray) {

    var duplicates  = arrayListOf<Int>()
    for(itemIndex in arr.indices){

        val goToIndex = Math.abs(arr[itemIndex]) - 1

        if(arr[goToIndex] < 0 ){
            duplicates.add(Math.abs(arr[itemIndex]))
        }

        arr[goToIndex] = -arr[goToIndex]
    }
    var duplicates2 = duplicates
}

fun main(){
    var arr = intArrayOf(10,2,5,10,9,1,1,4,3,7,-2,-2)
    println(findDuplicates(arr))
}