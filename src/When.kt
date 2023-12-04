fun main() {
    val finalExam = "A"
    when (finalExam) {
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Nice Try")
        else -> println("BAD")

    }
    val nilai = "A"
    when(nilai){
        "A", "B","C", "D" -> {
            println("Lulus")
        }
        else -> {
            println("Tidak Lulus")
        }
    }

    val num = 1
    val passValue = arrayOf(1,2,3)
    when (num) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }
    val nilaiUjian = 91
    when{
        nilaiUjian > 90 -> println("Amaizing")
        nilaiUjian > 80 -> println("Good job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Nice Try")
    }
}