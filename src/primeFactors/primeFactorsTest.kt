package primeFactors

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.*
import org.junit.jupiter.api.Test

class primeFactorsTest {
    /* Setup test harness using JUnit
    *  Running this will not do anything*/

    /* todo: Write a tool that will calculate the prime factors of an integer */

    @Test fun factors() {
        // test that an empty list is returned upon execution
        assertThat(factorsOf(1), `is` (emptyList()))    // the prime factor of 1 is empty
        assertThat(factorsOf(2), `is` (listOf(2)))      // the prime factor of 2 is just the number 2
    }

    private fun factorsOf(i: Int): List<Int> {
        val factors = mutableListOf<Int>()

        if (i>1)
            factors.add(2)
        return factors
    }



}