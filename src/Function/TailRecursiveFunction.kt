package Function

// penggunaan recursive function pada kotlin memiliki keterbatasan
// jika recursive function memanggil function dirinya sendiri terlalu dalam
// maka bisa dimungkinkan akan terjadi error stak overflow / menumpuk terlalu banyak
// maksudnya jika kita panggil recursive function sebanyak 10x contoh disply(10)
// maka akan menunggu proses recursive function ke 10 selesai
// maka dari itu kotlin mengakalinya dengan tail recursive function.
// tail recursive function adalah teknik mengubah recursive function menjadi looping biasa saat dijalankan
// syarat tail recursive function
// 1. tambahkan tailrec di functionnya
// 2. ketika dipanggil hanya boleh functionnya sendiri, tanpa embel - embel operasi dari data lain. contoh
// pada file RecursiveFunction.kt itu tidak bisa dijadikan tail recursive function, karena ada operasi perkalian
// saat pemanggilan function itu sendiri. value * recuriveFunction(value - 1)
fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialTailRecursive(value: Int, total: Int = 1): Int {
        return when(value) {
            0 -> 1 // !0 (factorial 0) adalah 1 bukan 0
            1 -> total
            else -> factorialTailRecursive(value - 1, total * value)
            // ketika kondisi when 1 maka akan mengembalikan nilai total
            // jika tida maka akan memanggil function factorialTailRecursive
            // pada function tsb ada params, params ke 2 adalah params default jd pada kasus ini tidak wajib disi.
            // total akan dikali dengan value, kemudian value akan dikurangi 1 sampai nilai value 1
            // total * value sama dengan total = total * value
        }
    }

    println(factorialTailRecursive(0))
    // simulasi tailrec
    // factorialTailRecursive(5,1)
    // factorialTailRecursive(4,5)
    // factorialTailRecursive(3,20)
    // factorialTailRecursive(2,60)
    // factorialTailRecursive(1,120)
    // hasil 120

    // berbeda jika tidak menggunakan tail recursive
    // contoh menggunakan function di RecursiveFunction.kt
    // factorialRecursive(4)
    // factorialRecursive(4) => 4 * factorialRecursive(3)
    // factorialRecursive(4) => 4 * factorialRecursive(3) => 3 * factorialRecursive(2)
    // factorialRecursive(4) => 4 * factorialRecursive(3) => 3 * factorialRecursive(2) => 2 * factorialRecursive(1)
}