package bucles


/*
Member Functions
A function declared within a class is known as a member function of that class.
In order to invoke a member function, we must call the function on an instance of the class.
 */

class Student(val name: String, val gpa: Double, val semester: String, val estimatedGraduationYear: Int) {

    init {
        println("$name has ${estimatedGraduationYear - 2020} years left in college.")
    }

    // Member Function
    fun calculateLetterGrade(): String {
        return when {
            gpa >= 3.0 -> "A"
            gpa >= 2.7 -> "B"
            gpa >= 1.7 -> "C"
            gpa >= 1.0 -> "D"
            else -> "E"
        }
    }
}

// When an instance is created and the function is called, when expression will execute and return a letter grade

fun main() {
    var student = Student("Lucia", 3.95, "Fall", 2022) // Prints: Lucia has 2 years left in college.
    println("${student.name}'s letter grade is ${student.calculateLetterGrade()}.")  // Prints: Lucia's letter grade is A.
}