package lesson2.task1

fun main() {
    println("MilesToKm/KmToMiles багдарламасына кош келдыныз!")
    println("Егер Сыз мильден км-га ауыстыргыныз келсе, 0 басыныз")
    println("Егер Сыз км-ден мильге ауыстыргыныз келсе, 1 басыныз")
    val a = readLine()
    if (a?.toIntOrNull() == null) {
        println("Тек 0 немесе 1 танданыз!!!")
        return
    }
    if (a.toInt() == 0) {
        milestokm()
    } else {
        if (a.toInt() == 1) {
            kmtomiles()
        } else {
            if (a.toInt() == 28669) {
                bunny()
            } else {
                println("Тек 0 немесе 1 танданыз!!!")
                return
            }
        }
    }
}


fun milestokm(){
    println("Кашыктыкты Мильмен корсетыныз:")
    val m = readLine()
    if (m?.toIntOrNull() == null){
        println("Тек санды берыныз!!!")
        return
    }
    val M = m.toInt()
    val K = M * 1.60934
    println("+------------+------------+")
    println("|    миль    |  километр  |")
    println("+------------+------------+")
    println("    $M           ${K.toInt()}")
    println("+------------+------------+")
}

fun kmtomiles(){
    println("Кашыктыкты Километрмен корсетыныз:")
    val k = readLine()
    if (k?.toIntOrNull() == null){
        println("Тек санды берыныз!!!")
        return
    }
    val K = k.toInt()
    val M = K * 0.621371
    println("+------------+------------+")
    println("|  километр  |    миль    |")
    println("+------------+------------+")
    println("    $K           ${M.toInt()}")
    println("+------------+------------+")
}


fun bunny(){
    println("""     (\_/)""")
    println("     (*.*)")
    println("E[:]||||||||[:]3")
    println("   ('')_('')")
    println("ItIsAnEasterEgg")
}