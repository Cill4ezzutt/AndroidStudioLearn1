# **KOTLIN PEMULA**

## **TIPE DATA NUMBER**

```aidl
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

```aidl
var char1 : Char = 'E'
```
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
```aidl
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
```
- String Trim Margin **.trimMargin()**

```aidl
var addres: String = """ |Street not yet done,
|province jawabarat,
|Country Indonesia""".trimMargin()
```

- String template **${isi expresi}**
```aidl
 var full: String = "$firstName $lastName $addres"
```

```aidl
var desc: String = "$full length = ${full.length}"
```

## **VARIABLE**

```aidl
val/var namaVarible: TipeData = data
```

- Mutabble (Bisa diubah) kata kunci **var**

```aidl
var name: String = "Eza"
```
- Immutable (Tida bisa diubah) Kata Kunci **val**

```aidl
val name1 = "cila"
```

- Nullabel

```aidl
var angka: Int? = 5
    angka = null
    println(angka)
```

- Variable Constant


```aidl
const val APP = "Belajar Kotlin"
const val VER = "0.0.1"


fun main() {
    var name: String = "Eza"
    val name1 = "cila"
    val age = 30

```
## **TYPE DATA ARRAY**
````$xslt
fun main() {
    val member: Array<String> = arrayOf("Eza", "Cila")
    println(member[1])
}
````

## **IF , ELSE & else if Expression**

```aidl
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

```aidl
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

```aidl
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

```aidl
val num = 1
    val passValue = arrayOf(1,2,3)
    when (num) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }
```
## **When Expression is & !is**

```aidl
val num = 1
    val passValue = arrayOf(1,2,3)
    when (num) {
        is passValue -> println("string")
        !is passValue -> println("not string")
    }
```
## **Final When**

```$xslt
val nilaiUjian = 91
    when{
        nilaiUjian > 90 -> println("Amaizing")
        nilaiUjian > 80 -> println("Good job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Nice Try")
    }
```

## **For Loop**

```aidl
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
```

## **While & Do While Loop**

```aidl
#while
fun main() {
    var i = 0

    while ( i < 10) {
        println("Perulangan $i")
        i++
    }
    println("Pengulangan Selesai")
}
#doWhile
var j = 5
    do {
        println("Perulangan ke $j")
        j++
    } while ( j < 10)
}
```
## **Break & Continue**
```aidl
fun main() {

    var i = 0
    while (true) {
        println("Hello ke $i")
        i++
        if (i> 100) {
            break
        }
    }

    for (i in 1..100) {
        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }

}
```

# **FUNCTION**
```aidl

fun helloWorld(){
    println("Hello World")
    println("Selamat Belajar")
}
fun sayHello(name:String, age:Int) {
    println("Hello $name")
    println("Saya Berumur $age")

}
fun hello(firstName:String, lastName:String? = null){
    if (lastName==null ){
        println("Hello $firstName ")
    } else {
        println("Hello $firstName $lastName")
    }
}
fun fullName(firstN:String, middleN:String, lastN:String){
    println("Hello $firstN $middleN $lastN")
}


fun main() {
    helloWorld()
    sayHello("Eza", 22)
    sayHello("Cilla", 20)
    hello("Eza")
    hello("Eza", "Cilla")

    fullName("Eza", "For", "Cilla")
    fullName(lastN = "Cilla",middleN = "For",firstN = "Eza")
}
```

## **UNIT RETURNING FUNCTION**
```aidl
fun printHello(): Unit {
    println("Hello")
}

fun main() {
    printHello()

}
```
## **FUNCTION RETURN TYPE**
```aidl
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
```
## **SINGLE EXPRESSION FUNCTION**
```aidl
fun kaliDua(a:Int): Int = a * 2
fun helo(name:String): Unit = println("Hello $name")
fun main() {
    println(kaliDua(10))
    hello("Eza")
}
```
## **Function Varargs Parameter**
```aidl
fun hitungTotal(name:String, vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    return total;
}
fun main() {
    val result = hitungTotal("Eza", 10,10,10,10,10,10)
    println(result)
}
```
## **EXTENSION FUNCTION**

```aidl
fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Hello $this")
fun main() {
    val name =  "Eza"
    println(name.hello())
    name.printHello()
    "EZA EZA".printHello()


}
```
## **FUNCTION INFIX NOTATION**
````aidl
infix fun String.to(type: String): String {
    if(type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Eza" to "UP"
    println(result)
}
````
## **FUNCTION SCOPE**

