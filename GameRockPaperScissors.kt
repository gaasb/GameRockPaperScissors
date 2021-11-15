import kotlin.random.Random
fun  main()
{
    val myList = arrayOf("Камень", "Ножницы", "Бумага")
    if (printResult(getUserChose(myList), getGameChose(myList),myList)) { println("ТЫ ВЫИГРАЛ")}
}
fun getGameChose(listOf: Array<String>): Int { return Random.nextInt(0, listOf.size) }
fun getUserChose(list: Array<String>): Int {
    var accesToExit = false
    var userInput: String? = ""
    while (!accesToExit)
    {
        userInput = readLine()
        if (userInput != null && userInput in list)
        {
            accesToExit = true
        }
        else println("НЕВЕРНЫЙ ВВОД")
    }
    return list.indexOf(userInput)
}
fun printResult(user: Int, game: Int, list: Array<String>): Boolean
{
    println("Вы выбрали ${list[user]} / Игра выбрала ${list[game]}")
    if (user == 0 && game == 1){
        return true}
    if (user == 1 && game == 2){
        return true}
    if  (user == 2 && game == 0){
        return true}
    if (user == game)
        println("Ничья!")
    else println("ТЫ ПРОИГРАЛ")
    return false
}
