package lesson3

import kotlin.math.max
import kotlin.math.min

fun main() {
    println("recursive: ${factorial(13)}")
    println("while: ${factorialWhile(13)}")
    println("for: ${factorialFor(13)}")

    println("fibonacci: ${fib(7)}")
    println("fibonacciFor: ${fibFor(7)}")
    println("fibonacciWhile: ${fibWhile(7)}")

    println("LowestCommonMultiple: ${findLowestCommonMultiple(6, 4)}")
    println("GreatestCommonDivisor: ${findGreatestCommonDivisor(6, 4)}")
    findDivisor(18)
}

fun findDivisor(n: Int): Int {
    var i = 2
    while (n / i != 1) {
        if (n % i == 0) {
        println (i)}
        i++
    }
    return 0
}

fun findGreatestCommonDivisor(n: Int, m: Int): Int {
    var x1 = max(n ,m)
    var x2 = min(n, m)
    var result = 0
    while (x1 % x2 != 0) {
        result = x1 % x2
        x1 = x2
        x2 = result
    }
    return result
}

fun findLowestCommonMultiple(n: Int, m: Int): Int {
    val max = max(n, m)
    for (i in max .. m * n){
        if (i % m == 0 && i % n ==0) return i
    }
    return m * n

}

fun fibWhile(n: Int): Int {
    var i = 3
    var x1 = 1
    var x2 = 1
    var result = 0
    while (i <= n) {
        result = x1 + x2
        x1 = x2
        x2 = result
        i++
    }
    return result
}

fun fibFor(n: Int): Int {
    var x1 = 1
    var x2 = 1
    var result = 0
    for (i in 3 .. n) {
        result = x1 + x2
        x1 = x2
        x2 = result
    }
return result
}

fun fib(n: Int): Long {
    if (n <= 2) return 1
    else {
        return fib(n - 1) + fib(n - 2)
    }
}

fun factorialFor(n: Int): Int {
    var result = 1
    for (i in 1 .. n) {
        result *= i
    }
    return result
}

fun factorialWhile(n: Int): Int {
    var result = 1
    var counter = 1
    while (counter <= n) {
        result *= counter
        counter++
    }
return result
}

fun factorial(n: Int): Int {
    if (n < 0) return 0
    if (n <= 1) return 1
    else
        return n * factorial(n - 1)
}
