package com.github.trly.euler.concepts

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class SquaresTest {

    private val squares = Squares()

    @Test
    @DisplayName("Should calculate the sum of squares up to a given number")
    fun testSumOfSquaresUpTo() {
        Assertions.assertThat(squares.sumOfSquaresUpTo(10)).isEqualTo(385)
    }

    @Test
    @DisplayName("Should calculate the square of the sum of numbers up to a given number")
    fun testSquareOfSumUpTo() {
        Assertions.assertThat(squares.squareOfSumUpTo(10)).isEqualTo(3025)
    }
}