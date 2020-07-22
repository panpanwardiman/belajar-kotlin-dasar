package Function

// Higher Order Function adalah function yang menggunakan function sebagai parameter
// atau mengembalikan function
// kerennya HOF itu adalah lambda yang dijadikan paramerter disebuah function
// penggunaan HOF berguna ketika kita ingin membuat function yang general dan ingin mendapatkan
// input flexible berupa lambda, yang bisa dideklarasikan oleh user ketika memanggil function tsb

fun main() {

    fun hello(value: String, transformer: (String) -> String): String {
        val nameTransform = transformer(value)
        return "Hello $nameTransform"
    }

    val lambdaUpper: (String) -> String = { value: String -> value.toUpperCase() }
    // Optional tanpa mendeklarasikan params tipe data dan return value
    // kotlin akan secara otomatis membaca tsb
    // jadi langsung saja = { params function -> body function }
    // val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("panpan", lambdaUpper))

    // dalam menggunakan HOF ini juga bisa langsung memasukan lambda dalam params
    // tanpa harus assign lambda ke variable
    // biasanya contoh ini lebih disering digunakan
    println(hello("WARDIMAN", { value: String -> value.toLowerCase() }))

    // trailing lambda
    val result = hello("hanif") { value: String ->
        value.toUpperCase()
    }

    println(result)
}
