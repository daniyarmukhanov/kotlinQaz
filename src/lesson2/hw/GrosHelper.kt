package lesson2.task1

fun main(){
    println("Қолыңызға тиетін айлығыңыз қанша?")
    val a = readLine()
    if (a?.toIntOrNull() == null){
        println("Тек санды берыныз!!!")
        return
    }
        val net = a.toInt()
        val gross = (net - 4250) / 0.81
        val pens = gross / 10
        val tax = ((gross - (gross / 10)) - 42500) / 10
    println("Қолыңызға тиетін айлық: $net тг")
    println("Салыққа: ${tax.toInt()} тг")
    println("Зейнетақы қорына: ${pens.toInt()} тг")
    println("Гросс айлығыңыз: ${gross.toInt()} тг")

}