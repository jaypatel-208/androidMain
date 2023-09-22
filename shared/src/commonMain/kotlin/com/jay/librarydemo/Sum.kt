package com.jay.librarydemo

interface Sum {
    fun soSum(num1: Int, num2: Int): Int
}

expect object SumFactory {
    fun createSum(): Sum
}