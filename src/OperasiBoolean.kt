fun main() {
    val finalExam = 80
    val attendant = 85
    val extra = 85

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80
    val passExtra = extra > 75

    val pass = passFinalExam && passAttendant && passExtra
    // akan dijalankan sebagai berikut
    // (passFinalExam && passAttendant) && passExtra
    // ((passFinalExam && passAttendant) && passExtra)
    // hasilnya False
    println(pass)

}