// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.lastOrNull { it % 2 == 1 }

    println(firstOddNumber)
}