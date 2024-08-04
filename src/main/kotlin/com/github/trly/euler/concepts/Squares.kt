package com.github.trly.euler.concepts

class Squares {
    fun sumOfSquaresUpTo(n: Long): Long {
        return ((n * (n + 1L) * ((2L * n) + 1L))/6L)
    }

    fun squareOfSumUpTo(n: Long): Long {
        val sum = (1..n).sum()
        return sum * sum
    }
}