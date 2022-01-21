import ScrabbleScore.scoreWord
import java.util.*

    private val input = Scanner(System.`in`);

    //TODO This program has many bugs in it...you will need to fix them so that you have the following functionality:
    // The main method should:
    //    - print out the letterValues to the console
    //    - ask the user to enter a word
    //    - display the Scrabble Score for the word (the case of the letters shouldn't matter i.e. u is the same as U)
    //    - the user is continually asked to enter a word until they type -1 (the sentinel value) to end the program
    fun main(args: Array<String>) {
        letterValues()
        while (true) {
            print("Enter a word and compute the Scrabble Score: ")
            val word = input.nextLine()
            println("$word has a value of ${scoreWord(word)}")
        }
    }

   fun letterValues() = """Letter                           Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10"""
