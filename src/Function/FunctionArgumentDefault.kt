package Function

fun main() {
    sayHello("Panpan")
    sayHello("Muhammad", "Hanif")
    sayHi("Wardiman")
    sayHi("Diman", null)
}

// Default Argument ketika fungsi Function.sayHello dipanggil
// maka kita tidak wajib memasukkan nilai pada parameter default tsb.
fun sayHello(firstName: String, lastName: String = "Kosong") {
    // Jika parameter ke 2 tidak diisi data, maka lastName akan diisi dengan data default yaitu "Kosong"
    println("Hello $firstName $lastName")
}

fun sayHi(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}