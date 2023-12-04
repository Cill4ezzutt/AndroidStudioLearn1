fun main() {
    var firstName: String = "Maulana"
    var lastName: String = "Reza"
    var fullName: String = "Maulana Reza"
    var addres: String = """ |Street not yet done,
|province jawabarat,
|Country Indonesia""".trimMargin()
    println(firstName)
    println(lastName)
    println(fullName)
    println(addres)

    var full: String = "$firstName $lastName $addres"
    println(full)
    var desc: String = "$full length = ${full.length}"
    println(desc)
}