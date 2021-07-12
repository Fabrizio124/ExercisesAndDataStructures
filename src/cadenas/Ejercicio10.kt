package cadenas

fun main(){
    println("Introduce los productos de tu cesta de compra")
    var productos = readLine()!!.toString()
    var coma = productos.split(",")

    println("Su lista de compras es:")
    for(i in 0..coma.size-1){
       println(coma[i])
    }
}