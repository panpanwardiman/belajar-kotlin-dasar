fun main() {
    var finalExam = 'A'

    when (finalExam) {
        'A' -> {
            println("Excellent")
        }
        'B' -> {
            println("Good")
        }
        // Bisa juga diexpresikan seperti berikut
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try again.")
        else -> println("Not Found")
    }

    // When Expression Multiple Option
    when (finalExam) {
        'A', 'B', 'C' -> println("Lulus")
        else -> println("Tidak Lulus")
    }

    // When Expression In (value di dalam array)
    // When Expression mempermudah pengecekan nilai array dibandingkan dengan menggunakan IF Expression
    finalExam = 'D'
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValue -> println("Lulus")
        // Bisa menggunakan !in atau else
        !in passValue -> println("Tidak Lulus")
    }

    // When Expression Is (untuk mengecek tipe data)
    when (finalExam) {
        is Char -> println("Yup, ini Char.")
        !is Char -> println("Ini bukan Char")
    }

    // When Expression sebagai pengganti IF Else Expression
    val valueExam = 80
    when {
        valueExam > 75 -> println("Good")
        valueExam > 60 -> println("Not Bad")
        else -> println("Try Again")
    }
}