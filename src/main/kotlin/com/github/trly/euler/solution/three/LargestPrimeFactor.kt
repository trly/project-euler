package com.github.trly.euler.solution.three

import com.github.trly.euler.concepts.Primes

val primes = Primes()
fun main() {
    print("Enter number to identify the largest prime: ")
    solve(readln().toLong())
}
fun solve(number: Long) {
    println("The largest prime factor of $number is ${primes.getLargestPrimeFactor(number)}")
}
