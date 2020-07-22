package Function

fun main() {
    // Varargs adalah variable argument.
    // Parameter yang berada diposisi terakhir, memiliki kemampuan dijadikan varargs.
    // Varargs artinya datanya dapat menerima lebih dari satu inputan, atau anggap saja seperti Arrray.
    // Jika parameter tipe array, wajib membuat array terlebih dahulu, sebelum mengirimkan ke function.
    // Jika varargs, kita dapat langsung mengirim datanya.

    val nilaiArray = arrayOf(10, 10, 10, 5)

    println(funWithVararg(10, 10, 10, 10, 10))
    println(funWithArray(nilaiArray))

}

// walaupun tipe data vararg values integer, tetapi values akan berubah menjadi IntArray
fun funWithVararg(vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }

    return total
}

fun funWithArray(values: Array<Int>): Int {
    var total = 0
    for (value in values) {
        total += value
    }

    return total
}