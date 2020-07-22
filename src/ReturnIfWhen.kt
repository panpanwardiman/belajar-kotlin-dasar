fun main() {
    fun sayHello(name: String = ""): String {
//        contoh return if
//        return if (name == "") {
//            "Hello stranger"
//        } else {
//            "Hello $name"
//        }

        // contoh return when
        return when (name) {
            "" -> "Hello Stranger"
            else -> "Hello $name"
        }
    }

    println(sayHello("Wardiman"))
}