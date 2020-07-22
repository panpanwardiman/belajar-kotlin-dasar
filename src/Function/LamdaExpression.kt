package Function

// function di kotlin adalah first class citizen artinya bisa dibuat tanpa bantuan class,
// artinya dianggap seperti tipe data lainnya.
// function bisa disimpan di dalam array, bahkan bisa dikirim ke parameter function itu sendiri
// lambda expression secara sederhana adalah function yang tidak memiliki nama
// dengan lambda kita bisa membuat function tanpa harus mendeklarasikan nama function nya
// cukup memasukkan function ke dalam variable atau parameter

fun main() {
    // cara membuat lambda expression
    // variable: (params tipe data) -> return value Tipe Data = { params function ->
    //     body function nya
    // }
    // pada lambda expression tidak perlu menuliskan return secara eksplisit
    // baris terakhir akan dibaca sebagai return value pada function tsb
    val lambdaExpression: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName"
        result
    }

    val hasil = lambdaExpression("Panpan", "Wardiman")
    println(hasil)

    // Kata Kunci It
    // kata kunci it digunakan jika kita tidak ingin mendeklarasikan params function pada lambda expression
    // kata kunci it hanya bisa digunakan jika params yang digunakan hanya 1
    val lambdaWithIt: (String) -> String = {
        // "Hello $it"
        it.toUpperCase()
    }

    val resultIt = lambdaWithIt("Panpan Wardiman")
    println(resultIt)

    // Lambda Method References
    // membuat lambda expression dengan function yang sudah ada
    val lambdaWithMethodReferences: (String) -> String = ::toLower

    println(lambdaWithMethodReferences("DIMAN"))
}

fun toLower(value: String): String = value.toLowerCase()