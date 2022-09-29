package ejerciciosSimples

fun minimumNumber(n: Int, password: String): Int {
    // Return the minimum number of characters to make the password strong

   var counter = 0

   var final = 0
   var vacio = 0


        val regex = Regex("[0-9]")
        var result = regex.containsMatchIn(password)
        println(result)
        if (!result){
            counter =  counter + 1
            println( "$counter counter")
        }

         val fRegex = Regex("[A-Z]")
          val fResult = fRegex.containsMatchIn(password)
         println(fResult)

          if (!fResult){
         counter =  counter + 1
              println( "$counter counter")
         }

          val sRegex = Regex("[a-z]")
         val sResult = sRegex.containsMatchIn(password)
         println(sResult)
         if (!sResult){
         counter =  counter + 1
             println( "$counter counter")
         }

        val tRegex = Regex("[-!@#$%^&*()+]")
         val tResult = tRegex.containsMatchIn(password)
        println(tResult)
        if (!tResult){
        counter =  counter + 1
            println( "$counter counter")
        }
        println("$counter counterFinal")



    if(counter >= 3 && counter < n){
           return counter
       }


    if (password.length < 6 || counter == 0 ){
        final = 6 - password.length
        counter = final

        println( "$counter counterX")
    }



return counter
}

fun main(){
   println(minimumNumber(5,"9pg"))
}