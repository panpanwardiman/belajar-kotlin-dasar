package Function

fun main() {
    // Terkadang kita menemukan function dengan parameter yang banyak
    // hal tersebut menyulitkan saat function tersebut dipanggil, kita harus benar - benar
    // tahu urutan parameter pada function tsb.
    // Function Named Argument adalah fitur dimana kita dapat menyebutkan nama parameter
    // saat memanggil function, dengan demikian kita tidak wajib tahu posisi tiap parameter.
    fullName(firstName = "Muhammad",
            lastName = "Wardiman",
            middleName = "Hanif")
}

fun fullName(firstName: String,
             middleName: String,
             lastName: String) {
    println("Hello $firstName $middleName $lastName")
}