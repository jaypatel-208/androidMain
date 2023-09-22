package com.jay.librarydemo

actual object SumFactory {
    actual fun createSum(): Sum = SumImplementation
}

object SumImplementation : Sum {
    override fun soSum(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}