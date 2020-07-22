package TypeData

fun main () {
    var firstname: String = "Panpan"
    var lastname: String = "Wardiman"
    var fullname: String = "$firstname $lastname"
    var desc: String = "Total Char $fullname: ${fullname.length}"
    var alamat: String = """
        |Desa Geresik,
        |Kecamatan Ciawigebang,
        |Kabupaten Kuningan
    """.trimMargin()

    // gunakan karakter (|) untuk menghapus karakter sebelumnya
    // gunakan trimMargin() untuk menggabungkan line

    println(fullname)
    println(desc)
    println(alamat)
}