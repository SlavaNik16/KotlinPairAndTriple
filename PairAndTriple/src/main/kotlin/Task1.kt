fun Task1() {
    try {
        println("Введите целое число(секунды)")
        var seconds: Int = readln().toInt()
        var (Hour, Min, Sec) = TimeTo(seconds)
        println("$seconds секунд = $Hour час(-ов, -a) $Min минут(-ы, -a) $Sec секунд(-а, -ы)")
    } catch (e: Exception) {
        println("Неверный формат!!!")
        System.exit(0)
    }
}

fun TimeTo(sec: Int): Triple<Int,Int,Int>{
    return Triple(sec/60/60%24,sec/60%60,sec%60)
}