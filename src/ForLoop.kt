fun main() {
    var array = arrayOf("Eza", "Cilla", "Abi", "Furqon", "Ezut", "Cutemi")
    var total = 0

    for (name in array) {
        println(name)
        total++

    }
    println("Total Perulangan = $total")

    for (i in 0..100 step 2) {
        println(i)
    }
    for (j in 100 downTo 0 step 3) {
        println(j)
    }
    val ukuranArray = array.size - 1
    for (x in 0..ukuranArray) {
        println("index $x = ${array.get(x)}")
    }
}