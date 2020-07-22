package Function

fun main() {
    // Function Scope adalah ruang lingkup dimana sebuah function bisa diakses.
    // kalau kita membuat function sejajar dengan function Function.Function.Function.Function.TypeData.TypeData.TypeData.TypeData.TypeData.Looping.Looping.main kotlin, maka function tsb
    // dapat diakses di file kotlin manapun.
    // jika ingin membatasi sebuah function hanya bisa diakses oleh function tertentu,
    // maka kita dapat membuatnya di dalam function atau inner function

    fun sayHello(name: String) = println("Hello $name")

    sayHello("Panpan")
}