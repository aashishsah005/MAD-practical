fun main() {
    print("Enter a number: ")
    val num = readln().toInt()
    println("$num is " + if (num % 2 == 0) "Even" else "Odd")
}
