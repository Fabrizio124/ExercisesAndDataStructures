package ejerciciosSimples

import java.util.*

fun chanceString(str: String): String {
    var example =  str
    var newStr = example.split("_")
    val parts = str.split(Regex("[/*_/]"))

    var aux = ""
    var memory = ""
    var flag = true

    for(index in 0..parts.size-1){
       println(parts[index].length)
      if (parts[index].length > 0){
           if (flag){
               aux = parts[index].lowercase()
               memory = memory + aux
               flag = false
           } else {
               aux = parts[index].lowercase()
               memory = memory + aux.replaceFirstChar({ firstChar ->
                   firstChar.uppercase()
               })
           }
      }
    }
    return memory
}

fun main() {
   println(chanceString("TIMEOUT_REQUEST_FOR_BACKEND_"))  // userClickDelayAndroid
}






/* #1 Given a string representing constant name (upper case words separated by underscore eg FOO_BAR) implement a function which converts
it into variable name (eg. fooBar):
1- convert first word to lowercase
2- convert next words to lowercase, but first character is still uppercase
3- remove all underscore characters

Examples:
Victor Manuel Gonzalez Ollervidez
12:32
decapitalizeConst("FOO") // foo decapitalizeConst("FOO_BAR") // fooBar decapitalizeConst("__FOO_BAR_BAZ") // fooBarBaz
 decapitalizeConst("TIMEOUT_REQUEST_FOR_BACKEND_") // timeoutRequestForBackend decapitalizeConst("_USER_CLICK_DELAY___ANDROID") // userClickDelayAndroid */