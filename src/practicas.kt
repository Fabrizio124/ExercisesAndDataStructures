

 private   fun main(args : Array<String>) {
        println("Hello, World")
        println("Kotlin is fun")
        println("A \n B \n C")

        //Variables
        var num  = 42
        println(num)

        var saludo = "hello world"
        println(saludo)


        //String se utiliza para palbras o frases enteras
        var name  = "James"

        val course = "Kotlin"
        println(course)

        val color: Int = 42

        val names = "James"
        var nums = 42
        val test = "88"

        // Operadores
        var num1 = 8
        var num2 = 34

        println(num1 + num2)
        println(num2 - num1)
        println(num1 + num2)
        println(num2 / num1)
        println(num2 % num1)

        var nums1 = 3
        var nums2 = 6
        var x = num2 / num1
        println(num2 / x)

        var numss = 4
        numss *= 5
        println(num)

        var numes = 8
        numes++
        println(numes)

        var a = 9
        var b = 15
        var res = a + b
        println(res)

        var age = readLine()
        println("You entered $age")

        var namesss = readLine()
        println(namesss)

        var c = readLine()!!.toInt()
        var d = readLine()!!.toInt()
        println(a + b)

        var int = 4
        x *= 2
        x -= 3
        x++
        println(x)
        //resultado es 6


        //CONDICIONAL IF
        val number = 42
        if (number == 42) {
            println("Bingo")
        }

        var ages = 12
        if (age != null) {
            if (age >= 18.toString()) {
                println("Welcome")
            } else {
                println("Not allowed")
            }
        }

        val numers = -7
        if (numers > 0) {
            println("Positive")
        } else if (num < 0) {
            println("Negative")
        } else {
            println("Zero")
        }

        var i = 1
        while (i <= 5) {
            println("Hello")
            i++
        }

        var xs = 4
        while (xs > 0) {
            println(x)
            x -= 2
        }


        var sum = 0
        var l = 1
        while (l <= 100) {
            sum += l
            l++
        }

        //Break & continue
        var sumes = 0
        var g = 1
        while (g <= 100) {
            sum += i
            i++
            if (sumes > 100) {
                break
            }
        }
        println(sumes)


        var z = 5
        while (z > 0)
            if (z == 2) {
                break
            }
        println(i)
        z--


        //Continue

        var sumar = 0
        var v = 1
        while (v <= 100) {
            v++
            if (v%2 != 0) {
                continue
            }
            sum += v
        }
        println(sumar)

        var q = arrayOf(1,2,3,4)

        val contacts = arrayOf("John", "James", "Amy")
        println(contacts[2])






    }



