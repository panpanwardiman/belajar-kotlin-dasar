package Function

fun main() {
    // Recursive Function adalah function yang memanggil function dirinya sendiri
    // kadang menggunakan recursive function lebih mudah dibandingkan menggunakan for loop dll
    // contoh kasus recursive function adalah factorial

    // factorial menggunakan looping
    fun factorialLoop(value: Long): Long {
        var result = 1L
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    // factorial menggunakan recursive
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialLoop(20))
    println(factorialRecursive(5))
}