package Function

fun main() {
    // Infix Notation adalah operasi yang biasa dilakukan di operasi matematika,
    // dimana dia akan melakukan operasi terhadap dua data.
    // Untuk menggunakan infix notation tidak wajib menggunakan tanda . (titik)
    // contoh lain dari infix notation adalah downTo

    // Syarat function infix notation
    // 1. harus dibuat function extention,
    // 2. harus memiliki 1 parameter
    // 3. params tidak boleh vararg dan tidak boleh memiliki nilai default
    val result = "Panpan Wardiman" to "UP"
    println(result)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}