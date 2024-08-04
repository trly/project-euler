package com.github.trly.euler.concepts

import kotlin.math.sqrt

class Primes {
    fun getPrimeFactors(number: Long): List<Long> {

        val factors: MutableList<Long> = mutableListOf()
        var n = number

        while (n % 2L == 0L) {
            factors.add(2)
            n /= 2
        }

        for (i in 3L..sqrt(n.toDouble()).toInt() step 2L) {
            while (n % i == 0L) {
                factors.add(i)
                n /= i
            }
        }

        return factors
    }

    fun getLargestPrimeFactor(number: Long): Long {
        return getPrimeFactors(number).max()
    }
}