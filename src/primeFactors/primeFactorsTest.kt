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
        assertThat(factorsOf(1), `is` (emptyList()))
    }

    private fun factorsOf(i: Int): List<Int> {
        return emptyList()
    }



}