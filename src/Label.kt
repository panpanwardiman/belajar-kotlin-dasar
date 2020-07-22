fun main() {
    // Label adalah penanda pada expression

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    // return label
    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Panpan")
        }
    }



    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            // contoh break loopI, jika tidak memberi label maka hanya looping j saja yang berhenti
            if (i > 5) {
                break@loopI
            }

            // contoh continue loopI, sama seperti break loopI
            // if (i > 5) {
            //    continue@loopI
            // }
            println("$i * $j = ${i * j}")
        }
    }
}