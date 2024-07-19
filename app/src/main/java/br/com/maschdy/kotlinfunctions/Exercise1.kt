package br.com.maschdy.kotlinfunctions

fun main() {
    println(sum(2, 3))

    println(multiply(2, 5))

    println(calculator(5, 10, ::sum))
    println(calculator(5, 10, ::multiply))
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun multiply(num1: Int, num2: Int): Int = num1 * num2

fun calculator(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}