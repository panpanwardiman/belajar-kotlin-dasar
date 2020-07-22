package Function

// menggunakan Higher Order Function adalah salah satu fitur yang sangat berguna
// namun penggunaan HOF akan berdampak terhadap performa saat berjalan,
// karena harus membuat object lambda berulang - ulang. jika penggunaannya
// tidak terlalu banyak mungkin tidak akan terasa, tetapi jika banyak sekali,
// maka akan terasa impact nya
// Inline function adalah kemampuan kotlin mengubah HOF menjadi inline function
// dimana dengan inline function, code di dalam HOF akan di duplicate
// agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang - ulang.

fun main() {
    for (i in 1..10) {
        println(helloInline({"Panpan"}, {"Wardiman"}))
    }
}

// jika menggunakan inline function maka pada saat runtime function helloInline tidak akan dipanggil terus menerus
// jika tidak maka akan dipanggil terus menerus dan hal tersebut jika terlalu banyak maka akan berpengaruh pada performa
// untuk menguji nya klik tools -> kotlin -> show kotlin bytecode kemudian decompile
inline fun helloInline(
        firstName: () -> String,
        noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}