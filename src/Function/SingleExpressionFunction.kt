package Function

fun main() {
    // Single Expression Function adalah deklarasi function dengan hanya 1 baris kode.
    // Jika kita membuat function yang sederhana misal 1 baris, maka bisa menggunakan
    // single expression function

    println(double(5))
    hi("Panpan")

}

fun double(a: Int): Int = a * 2

fun hi(name: String) = println("Hello $name")