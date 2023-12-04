# **TIPE DATA**

## **TIPE DATA NUMBER**


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

