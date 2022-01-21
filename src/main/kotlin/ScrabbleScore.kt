object ScrabbleScore {

    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    fun scoreWord(word: String) = word.sumOf(this::scoreLetter)

    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> error("Unknown character")
        }
    }

}