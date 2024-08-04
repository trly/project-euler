package com.github.trly.euler.concepts

import java.math.BigInteger

class Multiplication {

    fun findLargestProductOfAdjacentDigits(number: BigInteger, adjacentDigits: Int): Long {
        var startingDigit = 0
        val numberString = number.toString()
        val digitCombinations: MutableList<String> = mutableListOf()
        while(startingDigit < numberString.length - adjacentDigits) {
            digitCombinations.add(number.toString().substring(startingDigit, (startingDigit + adjacentDigits)))
            startingDigit++
        }
        return digitCombinations.map {
            it.split("").filterNot {
                it.isBlank()
            }.map {
                it.toInt()
            }.reduce {acc, i -> acc * i }
        }.max().toLong()
    }
}