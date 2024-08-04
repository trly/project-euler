package com.github.trly.euler.concepts

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class FibonacciTest {

    private val fibonacci: Fibonacci = Fibonacci()

    @Test
    @DisplayName("Should return a valid Fibonacci sequence")
    fun shouldReturnAValidFibonacciSequence() {
        Assertions.assertThat(fibonacci.getSequence(1, 89))
            .containsOnly(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    }
}