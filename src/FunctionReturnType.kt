fun jumlahkan(a:Int, b:Int): Int {
    val total = a + b
    return total
}
fun bagi(a:Int,b: Int):Int {
    if(b==0) {
        return  0
    }
    val result = a/b
    return result
}
fun main() {
    println(jumlahkan(10,10))
    println(jumlahkan(25,50))

    val result = jumlahkan(200,50)
    println(result)

    println(bagi(100,10))
    println(bagi(100,0))
}