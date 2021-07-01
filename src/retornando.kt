
// Cuenta en numeros los valores de los vocales que ponga en un texto
fun main() {
        fun getCount(str: String): Int {
                var vocal = 0
                var vocales = arrayOf('a', 'e', 'i', 'o', 'u')
                for (elemento in str) {
                        if (elemento in vocales) {
                                vocal++
                        }
                }

                return vocal
        }

       println(getCount("Hola"))

}