
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