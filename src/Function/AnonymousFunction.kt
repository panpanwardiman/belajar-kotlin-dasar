package Function

// lambda menganggap baris terakhir adalah return value
// terkadang kita perlu membuat lambda yang se flexible function, dimana kita bisa
// mengembalikan/return hasil dimanapun, untuk hal ini kita dapat menggunakan Anonymous Function
// anonymous function digunakan ketika kita ingin menggunakan lambda untuk function yang lebih kompleks

fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        val nameTransform = transformer(value)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("panpan", upper))
    println(hello("", upper))

    // anonymous function as parameter
    // membuat anonymous tanpa assign ke dalam variable seperti contoh di atas
    println(hello("WARDIMAN", fun(value: String): String {
        if (value == "") {
            return "Ups"
        } else {
            return value.toLowerCase()
        }
    }))
}