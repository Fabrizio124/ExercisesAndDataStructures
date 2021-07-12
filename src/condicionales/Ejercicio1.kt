package condicionales

//ES MAYOR DE EDAD?

fun main(){
    println("¿Cual es su edad?")
    var edad = readLine()!!.toInt()

   if (edad < 18 && edad > 0 ) {
       println("Es menor de edad")
   }

   else if (edad == 0 || edad > 150) {
       println("Error: Porfavor introduce un numero valido")
   }

   else if (edad >= 18 && edad < 150) {
       println("Es mayor de edad")

   }
}