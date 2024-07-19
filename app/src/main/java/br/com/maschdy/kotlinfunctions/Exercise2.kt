package br.com.maschdy.kotlinfunctions

fun main() {
    val intList = mutableListOf<Int>()
    for (i in 1..99) {
        intList.add(i)
    }
    val filteredList = intList.filter { it % 2 == 0 }
    println(filteredList)

    val nameList = mutableListOf("Osvaldo", "Valdir", "Kleberson", "Vitor")
    val greetingList = nameList.map { name -> "Olá $name" }
    greetingList.forEach { println(it) }
}
