package lesson2.task1
import kotlin.math.sqrt

fun main (){
    println("A санын бер:")
    val a = readLine()
    println("B санын бер:")
    val b = readLine()
    println("C санын бер:")
    val c = readLine()

    if (a?.toIntOrNull() == null
            || b?.toIntOrNull() == null
            || c?.toIntOrNull() == null){
        println("Тек санды берыныз!!!")
        return
    }

    println("Есептын берылгены: ${a}x^2 + ${b}x + $c = 0")
    println("Дискриминант формулаы:")
    println("+--------  ----+")
    println("|    2       |")
    println("| D=b - 4ac  |")
    println("+------------+")
    val A = a.toInt()
    val B = b.toInt()
    val C = c.toInt()
    val b2 = B * B
    val ac = 4 * A * C
    val D = b2 - ac
    println("D=$B^2-4*$A*$C = $b2 - $ac = $D")
    println("Дискриминант тен $D")
    println("x1 жане x2 табатын формуласы:")
    println("+------------------+")
    println("|            ,___  |")
    println("|      -b+/-V D '  |")
    println("|x1/2 = --------   |")
    println("|          2a      |")
    println("+------------------+")
    val x1 = (-1 * B + sqrt(D.toDouble()).toInt()) / 2 * A
    println("      ${-1 * B} + ${sqrt(D.toDouble()).toInt()}")
    println("x1 = ---------- = $x1")
    println("         ${A * 2}")
    val x2 = (-1 * B - sqrt(D.toDouble()).toInt()) / 2 * A
    println("      ${-1 * B} - ${sqrt(D.toDouble()).toInt()}")
    println("x2 = ---------- = $x2")
    println("         ${A * 2}")
    println("x1 = $x1")
    println("x2 = $x2")
}