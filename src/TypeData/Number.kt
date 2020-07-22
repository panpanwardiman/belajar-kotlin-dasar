package TypeData

fun main() {
    // Number integer / bulat
    var height: Int = 200
    var balance: Long = 10000000000L

    // Floating point number / pecahan
    var sampleFloat: Float = 10.10F
    var sampleDouble: Double = 10.10

    // Literal
    var decimal: Int = 100
    var hexadecimal: Int = 0xFF
    var binary: Int = 0b01010101

    // Underscore in number
    // Digunakan untuk mempermudah menghitung jumlah anggka
    var price: Long = 100_000_000L

    // Convertion
    var doubleBinary: Double = binary.toDouble()


    println("Tinggi: " + height)
    println("Saldo: " + balance)
    println("Sample Float: " + sampleFloat)
    println("Sample Double: " + sampleDouble)
    println("Decimal: " + decimal)
    println("Hexadecimal: " + hexadecimal)
    println("Binary: " + binary)
    println("Price with underscore feature: " + price)
    println("Convertion binary Function.to Function.double: " + doubleBinary)
}