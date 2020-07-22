package TypeData

// variable constant adalah variable global yang dapat diakses dimanapun
// variable constant wajib menggunakan val karena immutable
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main () {
    // val menggubah variable bukan value
    // direkomendasikan menggunakan immutable
    // immutable (tidak bisa diubah)
    // cara mendeklarasikan variable bisa mengetikan tipe data secara eksplisit atau tidak.
    val firstName = "Panpan"
    // mutable (bisa diubah)
    var price = 10000
    price = 5000

    println(firstName)
    println(price)

    // variable nullable
    var lastName: String? = null
    lastName = "Wardiman"
    println(lastName)
    println(lastName?.length)

    // result variable constant
    println("$APP : $VERSION")
}