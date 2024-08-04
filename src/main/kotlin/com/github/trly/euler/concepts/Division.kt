package com.github.trly.euler.concepts

class Division {
    fun findSmallestEvenlyDivisibleNumerator(rangeStart: Long, rangeEnd: Long): Long {
        var dividend: Long = 1
        while (true) {
            for(divisor in rangeStart..rangeEnd){
                print("$dividend/$divisor")
                if (dividend % divisor != 0L && divisor == rangeEnd) {
                    return divisor
                } else {
                    break
                }
            }

            dividend++
        }
    }
}