fun main() {
    println((generateSpecialChar() + generateText() + generateNums()))
}

// de

private fun generateNums(start: Int = 10, end: Int = 99) =
            (start..end).shuffled()[4].toString() + // 4 is a guessed Int
            (start..end).shuffled().last().toString()

private fun generateSpecialChar(): String {
    val randomChar = (0..4).shuffled().last()
    val chars = arrayOf("@", "#", "$", "&", "_", "!")
    return chars[randomChar] 
}

private fun generateText(): String {
    val random1 = (0..30).shuffled().last()
    val random2 = (0..30).shuffled().last()
    val random3 = (0..30).shuffled().first()

    val lowerCase: Array<String> =
        arrayOf(
            "f", "g", "h", "i", "j", "k",
            "a", "b", "c", "d", "e", "l",
            "t", "u", "v", "w", "x", "y", "z",
            "m", "n", "o", "p", "q", "r", "s"
        )
    
    // create an uppercase array and add it to the lowercase one

    val upperCase: Array<String> =
        arrayOf(
            "G", "H", "I", "J", "K", "L",
            "A", "B", "C", "D", "E", "F",
            "S", "T", "U", "V", "W", "X", "R",
            "Y", "Z", "M", "N", "O", "P", "Q"
        )

    val alphabets = lowerCase + upperCase
    return (alphabets[random1] + alphabets[random2] + alphabets[random3])
}
