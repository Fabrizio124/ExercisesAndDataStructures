fun sumConsecutives(s: List<Int>): List<Int> {
    var count = 1
    val result = arrayListOf<Int>()
    var cur = s[0]

    for (item in 1 until s.size) {
        if (cur == s[item]) { count++ }
        else {
            result.add(cur * count)
            cur = s[item]
            count = 1
        }
    }
    result.add(cur * count)
    return result
}

fun main(){
    println(sumConsecutives(listOf(-5, -5, 7, 7, 12, 0)))
}