package com.github.trly.euler.concepts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.DisplayName

internal class PrimesTest {

    private val primes: Primes = Primes()

    @Test
    @DisplayName("Should calculate all prime factors of 13195")
    fun shouldCalculatePrimeFactors() {
        assertThat(primes.getPrimeFactors(13195 )).containsOnly(5, 7, 13, 29)
    }

    @Test
    @DisplayName("Should calculate the largest prime factor of 13195")
    fun getLargestPrimeFactor() {
        assertThat(primes.getLargestPrimeFactor(13195)).isEqualTo(29)
    }
}