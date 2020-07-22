package Function

fun main() {
    // Ada 2 jenis Function yaitu function yang mengembalikan nilai dan function yang tidak mengembalikan nilai.
    // Function pada Function.kt, FunctionArgument.kt itu mengembalikan tipe data Unit.
    // Unit sendiri adalah tanda bahwa function tsb tidak mengembalikan apa - apa.
    // Penulisan Unit sendiri tidak wajib, tetapi jika kita menuliskannya secara eksplisit, maka secara otomatis
    // menjadi Unit.

    // Kalau di Java Unit itu Void function yang tidak mengembalikan nilai.
    // Bedanya di Java wajib menuliskan void pada function nya.
    printHello()
}

// Unit ditulis secara ekspilist    
fun printHello(): Unit {
    print("Hello World")
}

