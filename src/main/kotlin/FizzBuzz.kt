package org.study

object FizzBuzz {
    private fun handle(value: Int): Any {
        when {
            value % 3 == 0 && value % 5 == 0 -> return "FizzBuzz"
            value % 3 == 0 -> return "Fizz"
            value % 5 == 0 -> return "Buzz"
        }

        return value
    }

    fun calculate(value: Int) = handle(value)

    fun calculate(values: List<Int>): List<Any> {
        return values.map { handle(it) }
    }
}
