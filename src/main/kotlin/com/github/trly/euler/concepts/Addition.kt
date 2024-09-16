package com.github.trly.euler.concepts

import java.math.BigInteger

class Addition {
    fun bigIntegerSum(x: BigInteger, y: BigInteger): BigInteger {
        println("Adding $x + $y")
        return x.plus(y)
    }
}