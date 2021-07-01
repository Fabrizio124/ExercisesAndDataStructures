fun solve(meal_cost: Double, tip_percent: Double, tax_percent: Double): Int {
    // Write your code here


   val tip_percenta =  tip_percent/100 * meal_cost
   val tax_percenta = tax_percent/100 * meal_cost
    println("meal_cost: $meal_cost + tip_percent: $tip_percenta + tax_percent: $tax_percenta")
    val result =  meal_cost + tip_percenta + tax_percenta
    return result.toInt()

}


fun main(args: Array<String>) {


    println(solve(12.0, 20.0 , 8.0))
    println(solve(15.50, 15.0 , 10.0))
            println(solve(100.0, 10.0 , 16.0))

}
