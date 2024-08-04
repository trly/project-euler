package com.github.trly.euler.concepts

class Fibonacci {
    fun getSequence(initialTerm: Long, maxTermValue: Long): List<Long> {
        val fibSeq: MutableList<Long> = mutableListOf(initialTerm, (initialTerm + initialTerm))

        while (fibSeq[fibSeq.lastIndex] < maxTermValue) {
            fibSeq.add(fibSeq[fibSeq.lastIndex - 1] + fibSeq[fibSeq.lastIndex])
        }

        return fibSeq
    }
}