//FORMA GENERAL PARA OBTENER EL VALOR MAYOY DE UN NUMERO INT, TAMBIEN SIRVE PARA TIPO STRING SOLO SE MODIFICA


fun maximo(arrai: ArrayList<Int>) :Int{
    var max = arrai[0]
    // siempre partimos desde 0 poque des desde ahi cuenta nuestro array(cadena)
    for (index in 0 until arrai.size){
     // until signifa hasta va a contar desde 0 el inicio hasta nuestro "arrai"
     // el .size se utiliza para contar el tamaño de nustro array y el .lenght se utiliza para tipo String
        if(max < arrai[index]){
            // si max es menor a nuestro arrai dentro el index
                // Un index Un índice es una representación numérica de la posición de un elemento en una secuencia
            max = arrai[index]
            // entonces nuestra variable max es igual a arrai de nuestro index
        }
    }
    return max
    // retornamos una funcion siempre el max siempre una funcion debe retornar
    // el return siempre va al final
}
fun main() {
    println(maximo(arrayListOf(4,6,1,2,3,4,5,6)))
}
//COMPROBAMOS CON UN ARRAYLIST DE VALORES, EN UNA FUNCION APARTE