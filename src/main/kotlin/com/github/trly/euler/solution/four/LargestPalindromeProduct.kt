package com.github.trly.euler.solution.four

import com.github.trly.euler.getProblem

/**
 *
 */
fun main() {
    print(getProblem(4))
    val array1 = (100L..999L).toList()
    val array2 = (100L..999L).toList()
    val palindromes = mutableMapOf<String, Long>()

    for (x in array1) {
        for (y in array2) {
            val product = x * y
            if (product.toString() == product.toString().reversed()) {
                palindromes["$x x $y"] = product
            }
        }
    }
    print(palindromes.maxWith { x, y -> x.value.compareTo(y.value) })
}

