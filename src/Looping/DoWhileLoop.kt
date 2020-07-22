package Looping

fun main() {
    // Do While Loop hampir sama dengan While Loop akan tetapi
    // dalam Do While Loop kode block akan di eksekusi terlebih dahulu,
    // baru di akhir akan dilakukan pengecekan kondisi

    // Notes
    // pada Do While Loop jika kondisi salah maka akan sekali dieksekusi, contoh ubah kondisi
    // di bawah menjadi i > 5, maka akan tampil Hello 0

    var i = 0
    do {
        println("Hello $i")
        i++
    } while (i < 5)
}