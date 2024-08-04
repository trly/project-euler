package com.github.trly.euler.solution.two

import com.github.trly.euler.concepts.Fibonacci

private val fibonacci: Fibonacci = Fibonacci()
fun main() {
    print("Enter initial term of Fibonacci sequence: ")
    val initialTerm = readln().toLong()
    print("Enter largest term of Fibonacci sequence: ")
    val maxTermValue = readln().toLong()
    val sequence = fibonacci.getSequence(initialTerm, maxTermValue)
    val evenNumbers = sequence.filter { x -> x % 2L == 0L}
    println("Fibonacci Sequence: $sequence")
    println("Sum of even numbers $evenNumbers is ${evenNumbers.sum()}")
}
