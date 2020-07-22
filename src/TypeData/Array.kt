package TypeData

fun main() {
    // deklarasi array dengan mengetikkan secara ekplisit tipe datanya.
    // val names: Array<String> = arrayOf("Panpan", "Wardiman", "Diman")

    // deklarasi array dengan tidak mengetikkan tipe datanya.
    val names = arrayOf("Panpan", "Wardiman", "Diman")
    names.set(0, "John")
    names[2] = "Arjun"

    println(names.get(0))
    println(names[1])
    println(names.get(2))
    println(names.size)

    // Array dengan value null gunakan ? setelah tipe datanya.
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Yudi"
    members[1] = "Budi"
    members[2] = "Rudi"
    members[3] = null
    members[4] = "Budiman"
    println(members.size)
    println(members.get(0))
}