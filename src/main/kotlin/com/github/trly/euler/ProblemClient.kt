package com.github.trly.euler

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun getProblem(problemNumber: Long): String {
    val doc: Document = Jsoup.connect("https://projecteuler.net/minimal=${problemNumber}").get()
    return doc.wholeText()
}
