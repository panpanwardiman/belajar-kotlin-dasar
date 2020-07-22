package Looping

fun main() {
    // Break digunakan untuk menghentikan seluruh perulangan
    var i = 0
    while (true) {
        println("Break me $i")
        i++
        if (i > 5) {
            break
        }
    }

    // Continue digunakan untuk menghentikan perulangan yang sedang berjalan
    // menampilkan bilangan ganjil.
    // jadi ketika j mod 2 hasil nya 0 maka perulangan tersebut akan dihentikan dan akan lanjut keperulangan
    // selanjutnya.
    for (j in 1..100) {
        if (j % 2 == 0) {
            continue
        }
        println(j)
    }
}