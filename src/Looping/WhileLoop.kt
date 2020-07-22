package Looping

fun main() {
    // While Loop perulangan yang sangat flexible, dimana kode while akan melakukan
    // pengecekan kondisi, jika kondisi True maka blok while akan terus melakukan perulangan
    // sampai kondisi False.

    var value = 0
    while (value < 10) {
        println("Hello World $value")
        value++
    }
    println("Loop Finish")
}