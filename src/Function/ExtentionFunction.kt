package Function

fun main() {
    // Extention Function adalah kemampuan untuk menambahkan function pada tipe data yang sudah ada
    // Untuk membuat Expression Function kita cukup menambahkan tipe data lalu diikuti tanda . (titik)
    // Untuk mengakses data di expression function, kita bisa menggunakan kata kunci this.
    val name = "Panpan"
    val hello = name.hello()

    println(hello)
    "Wardiman".hai()
}

// function dengan mengembalikan data String
// $this dengan tanda dollar untuk memanggil data String pada expression function
// jika bukan string maka tidak perlu tanda dollar
fun String.hello(): String = "Hello $this"

// function tanpa pengembalian data
fun String.hai(): Unit = println("Hai $this")
