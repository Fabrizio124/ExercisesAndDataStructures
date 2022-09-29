package ejerciciosSimples

/*
 * Complete the 'hackerrankInString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun hackerrankInString(s: String): String {
    // Write your code here
    var a = "yes"
    var b = "no"
    var word = "hackerrank"
    var auxIndex = 0

    for (index in 0..s.length -1 ){
        println(s[index])
        if (s[index] == word[auxIndex]){
            auxIndex = auxIndex + 1
            if(auxIndex == word.length){
                return a
              }
            }
        }

    return (b)
}

fun main(){
   // hackerrankInString("hereiamstackerrank")
    hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt")
}

