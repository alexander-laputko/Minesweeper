import kotlin.random.Random

fun main() {
    print("How many mines do you want on the field? ")
    val numberMines = readLine()!!.toInt()
    val myField = Array(9) { Array<Char>(9) { '.' } }

    fun printField() {
        for (array in myField) {
            for (i in array) {
                print("$i")
            }
            println()
        }
    }

    repeat(numberMines) {
        while (true) {
            val i = Random.nextInt(9)
            val j = Random.nextInt(9)
            if (myField[i][j] != 'X') {
                myField[i][j] = 'X'
                break
            }
        }
    }

    printField()
}