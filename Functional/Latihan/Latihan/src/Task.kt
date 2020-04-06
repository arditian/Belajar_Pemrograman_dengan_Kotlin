fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    fun cetak(){
        println("First letter is $firstChar and $lastChar for second letter")
    }
    cetak()
}

// TODO 1
fun String.getFirstAndLast() = mapOf(
        "first" to this[0],
        "last" to this[this.length - 1]
)