package Looping

fun main() {
    // For Loop adalah salah satu fitur perulangan kotlin
    // For digunakan untuk melakukan perulangan iterasi data iterator (Array, Range dll)

    // perulangan For pada data Array
    val names = arrayOf("Diman", "Hanif", "Panpan")
    for (name in names) {
        println(name)
    }

    // perulangan For pada data Range
    val sizeArray = names.size - 1
    for (value in 0..sizeArray) {
        println("Index $value: ${names.get(value)}")
    }

    for (value in 100 downTo 0 step 2) {
        println(value)
    }
}