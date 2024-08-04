package com.github.trly.euler.solution.one

fun main() {
    println("Largest number to calculate multiples of: ")
    val lessThanEqual = readln().toLong()
    println("Multiples to find, comma separated. [EX: 2,3,5]: ")
    val multiplesOf = readln().split(",").map{ it.toLong() }
    val multiples: MutableList<Long> = mutableListOf()

    for (i in 1 until lessThanEqual) {
        if (multiplesOf.any { m -> i % m == 0L }) {
            multiples.add(i)
        }
    }
    println("Sum of multiples of $multiples below $lessThanEqual is ${multiples.sum()}")
}
