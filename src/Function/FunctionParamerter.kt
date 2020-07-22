package Function

fun main() {
    // Function Parameter adalah data yang dikirim dari luar function, untuk digunakan
    // dalam function itu sendiri.
    // Di kotlin parameter function by defaultnya itu adalah val

    hello("Panpan", "Wardiman")
    hello("Hanif", null)
}

fun hello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}