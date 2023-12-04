# **KOTLIN PEMULA**

## **TIPE DATA NUMBER**

```$xslt
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
```

## **TIPE DATA KARAKTER**

``
var char1 : Char = 'E'
``

isinya hanya 1 karakter

## **TIPE DATA BOLEAN**

Kode Kunci **Boolean**

``
 var benar: Boolean = true
``

``
var salah: Boolean = false
``

## **TIPE DATA STRING**
Representasi 
tanda petik 2 satu baris
tanda petik 3 untuk beberapa baris
``
fun main() {
    var firstName: String = "Maulana"
    var lastName: String = "Reza"
    var fullName: String = "Maulana Reza"
    var addres: String = """ Street not yet done,
province jawabarat,
Country Indonesia"""
    println(firstName)
    println(lastName)
    println(fullName)
    println(addres)
}
``
- String Trim Margin **.trimMargin()**

``
var addres: String = """ |Street not yet done,
|province jawabarat,
|Country Indonesia""".trimMargin()
``

- String template **${isi expresi}**
``
 var full: String = "$firstName $lastName $addres"
``

``
var desc: String = "$full length = ${full.length}"
``

## **VARIABLE**

``
val/var namaVarible: TipeData = data
``

- Mutabble (Bisa diubah) kata kunci **var**

var name: String = "Eza"

- Immutable (Tida bisa diubah) Kata Kunci **val**

``
val name1 = "cila"
``

- Nullabel

``
var angka: Int? = 5
    angka = null
    println(angka)
``

- Variable Constant


````$xslt
const val APP = "Belajar Kotlin"
const val VER = "0.0.1"


fun main() {
    var name: String = "Eza"
    val name1 = "cila"
    val age = 30

````
## **TYPE DATA ARRAY**
````$xslt
fun main() {
    val member: Array<String> = arrayOf("Eza", "Cila")
    println(member[1])
}
````

## **IF , ELSE & else if Expression**

```$xslt
fun main() {
    val examValue = 80
    if (examValue > 80) {
        println("Good job")
    } else if (examValue == 80){
        println("Not Bad")
    } else {
        println("Nice Try")
    }
}
```
## **When Expression**

```$xslt
fun main() {
    val finalExam = "A"
    when (finalExam) {
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Nice Try")
        else -> println("BAD")

    }
}
```
## **When Expression Multiple Option**

```$xslt
val nilai = "A"
    when(nilai){
        "A", "B","C", "D" -> {
            println("Lulus")
        }
        else -> {
            println("Tidak Lulus")
        }
```

## **When Expression in & !in**

```$xslt
val num = 1
    val passValue = arrayOf(1,2,3)
    when (num) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }
```
## **When Expression is & !is**

```$xslt
val num = 1
    val passValue = arrayOf(1,2,3)
    when (num) {
        is passValue -> println("string")
        !is passValue -> println("not string")
    }
```
## ** Final When**

```$xslt
val nilaiUjian = 91
    when{
        nilaiUjian > 90 -> println("Amaizing")
        nilaiUjian > 80 -> println("Good job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Nice Try")
    }
```