package Function

fun main() {
    // Jika function tsb kita deklarasikan dengan tipe data String,
    // maka wajib di dalam blok function mengembalikan data String tsb
    val result = sum(3, 5)
    println(result)

    println(div(100, 0))
}

// Function Function.sum di bawah mengembalikan nilai integer maka wajib menuliskan Unit Returning
// pada function Function.sum dengan tanda : TipeData yang digunakan
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun div(a: Int, b: Int): Int {
    // Check apakah b sama dengan 0, karena dalam matematika pembagi tidak bisa 0
    if (b == 0) {
        return 0
    } else {
        val total = a / b
        return total
    }
}