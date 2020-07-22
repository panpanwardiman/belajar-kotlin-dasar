package Function

// Closure adalah kemampuan sebuah function, lambda, anonymous function berinteraksi
// dengan data - data disekitarnya dalam scope yang sama
// harap gunakan fitur ini dengan bijak
// sebaiknya sebisa mungkin hindari penggunaan closure

fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()

    println(counter)
    // hasilnya 2
    // kenapa harus dihindari, karena akan merubah nilai default variable counter = 0
}