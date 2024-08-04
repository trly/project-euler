package com.github.trly.euler.solution.six

import com.github.trly.euler.concepts.Squares
import com.github.trly.euler.getProblem

val squares: Squares = Squares()

fun main() {
    print(getProblem(6))
    print("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sums is: ${squares.squareOfSumUpTo(100) - squares.sumOfSquaresUpTo(100)}")
}