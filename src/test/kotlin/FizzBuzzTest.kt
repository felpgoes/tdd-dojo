import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.study.FizzBuzz

// Cenarios de Teste
// 1. Se o numero for divisivel por 3, deve retornar "Fizz"
// 2. Se o numero for divisivel por 5, deve retornar "Buzz"
// 3. Se o numero for divisivel por 3 e 5, deve retornar "FizzBuzz"

class FizzBuzzTest {

    @Test
    fun `Should return Fizz when number is divisible by 3`() {
        val result = FizzBuzz.calculate(3)

        assertEquals("Fizz", result)
    }

    @Test
    fun `Should return Fizz when number is divisible by 5`() {
        val result = FizzBuzz.calculate(5)

        assertEquals("Buzz", result)
    }

    @Test
    fun `Should return Fizz when number is divisible by 3 and 5`() {
        val result = FizzBuzz.calculate(15)

        assertEquals("FizzBuzz", result)
    }

    @Test
    fun `Should return the own number when number is not divisible by 3 or 5`() {
        val result = FizzBuzz.calculate(11)

        assertEquals(11, result)
    }

    @Test
    fun `Should return a correct list when receive a list of 15 numbers`() {
        val values = (1..15).toList()
        val result = FizzBuzz.calculate(values)

        assertEquals(
            listOf(
                1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"
            ),
            result
        )
    }
}