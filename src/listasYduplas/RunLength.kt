package listasYduplas

fun RunLength(str: String): String {

    var example = 0
    var num = ""

    for (index in 0..str.length -1 ) {
         if (str[index ] == str[index + 1]){
             example = example + 1
            if(index+1 == str.length -1 ){
             example = example + 1
                num = num + "${str[index+1]}${example}"
                break
            }
         } else {
             example = example + 1
              num =  num + "${str[index]}${example}"
             example  = 0
             if(index+1 == str.length -1){
                 example = example + 1
                 num = num + "${str[index+1]}${example}"
                 break
         }
         }
         }

    return  num
}

fun main () {
    println(RunLength("wwwbbbw"))
    println(RunLength("----"))
    println(RunLength("aabbcde"))
    println(RunLength("----"))
    println(RunLength("aabbcdee"))

}