package com.github.trly.euler.concepts

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.math.BigInteger

class AdditionTest {

    private val addition: Addition = Addition()

    @Test
    @DisplayName("Should add two BigIntegers")
    fun testSumOfSquaresUpTo() {
        Assertions.assertThat(addition.bigIntegerSum(BigInteger.ONE, BigInteger.ONE)).isEqualTo(BigInteger("2"))
    }
}