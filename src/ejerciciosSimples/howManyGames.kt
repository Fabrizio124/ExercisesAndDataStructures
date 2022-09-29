package ejerciciosSimples

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy

    var spent = p
    var secDiference = p
    var counter = 1
    var example = 0

    if (p > s){
        return 0
    }
    if (p == s){
        return 1
    }
    if (p <= d){
        return s
    }

    while (d < p) {
        secDiference = secDiference - d // 20, 17 , 14, 11, 8 , 5
        spent = spent + secDiference //  20+17: 37
        if (spent >= s){
            return  counter
        }
        counter = counter + 1

        example = secDiference - d

        if (example <= m) { // 5
            while (spent <= s) {
                spent = spent + m     // 76
                counter = counter + 1    // 6
            }
            spent = spent - m
            println(counter)
            counter = counter - 1
            break
        }
    }
    return counter
}

fun main() {
    println(howManyGames(88, 77, 88, 9912))
}

