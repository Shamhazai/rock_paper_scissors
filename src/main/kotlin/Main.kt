import kotlin.random.Random

fun main() {
    var scoreUsr = 0
    var scoreBot = 0
    val values = arrayOf("К", "Н", "Б")

    while (true) {
        println("Ну, выбирайте: Камень - К, Ножницы - Н, Бумага - Б. Чтобы выйти, введите -")
        val choice = readln()
        if (choice == "-") {
            return
        }
        var result = "Ничья"

        val botChoice = values[Random.nextInt(0, 3)]
        if (values.contains(choice)) {
            when (choice) {
                "К" -> when (botChoice) {
                    "Н" -> result = "Выигрыш"
                    "Б" -> result = "Проигрыш"
                }
                "Н" -> when (botChoice) {
                    "Б" -> result = "Выигрыш"
                    "К" -> result = "Проигрыш"
                }
                "Б" -> when (botChoice) {
                    "К" -> result = "Выигрыш"
                    "Н" -> result = "Проигрыш"
                }
            }
            when (result) {
                "Проигрыш" -> scoreBot++
                "Выигрыш" -> scoreUsr++
            }
            println("Бот выбрал $botChoice - $result \n Счет: Вы $scoreUsr Бот $scoreBot")
        } else {
            println("Ошибочка.. Неверный ввод")
        }
    }
}