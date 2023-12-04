fun main() {
    var age: Byte = 30
    var height: Int = 17
    var distance: Short = 2000
    var balance: Long = 1000_000_000L


    println(age)
    println(height)
    println(distance)
    println(balance)

    var ukur: Double = 12.12
    var sample: Float = 20.20F
    println(ukur)
    println(sample)

//    Literal
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0101010

    println(binaryLiteral)

//    Conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()


}