package condicionales

fun main (){
    println("Bienvenido a la pizzeria Bella Napoli")
    println("Escoge una opcion")
    println("Tipos de pizza\n" +
            "1- Vegetariana\n" +
            "2- No vegetariana")
    var vegetariano = "1"
    var noVegetariana = "2"
    var decision = readLine()!!.toString()

    if (decision == vegetariano){
        println("1- Pimiento\n" +
                "2- tofu")
        var opcion = readLine()!!.toString()
        if(opcion == "1"){
            println("Tu pizza lleva  mozzarella ,tomate pimiento")
        }else{
            println("Tu pizza lleva mozzarella,tomate y tofu")
        }
    }

    if (decision == noVegetariana ){
        println("1- Peperoni\n" +
                "2- Jamón\n" +
                "3- Salmón")
        var segundaOpcion = readLine()!!.toString()
        if(segundaOpcion == "1"){
            println("Tu pizza lleva  mozzarella ,tomate y peperoni")
        }
        if (segundaOpcion == "2"){
            println("Tu pizza lleva  mozzarella ,tomate y jamon")
        } else {
            println("Tu pizza lleva  salmon ,tomate y jamon")
        }
    }
}