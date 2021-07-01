fun longest(s1:String, s2:String): String {
    val primero = s1 + s2
    var segundo = ""
    val arr = primero.toCharArray().sorted()
    val finalArray = arr.size-1
    for(i in 0..finalArray){

            if (finalArray == i) {
                segundo = segundo + arr[i]
                   break

            }else if (arr[i]  != arr[i+1]) {
                    segundo = segundo + arr[i]

            }
        }

    return segundo
}

fun main(){
    println(longest("inmanylanguages", "theresapairoffunctions"))
}