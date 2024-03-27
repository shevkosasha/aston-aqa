package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FactorialTest {

    @Test
    void factorial_of_zero_is_one() {
        try {
            Assertions.assertEquals( Factorial.getFactorialOf(0), 1, "factorial of zero should be one");
        } catch (IOException e) {
            Assertions.assertEquals(null, e);
        }
    }

    @Test
    void factorial_of_one_is_one() {
        try {
            Assertions.assertEquals(Factorial.getFactorialOf(1), 1, "factorial of one should be one");
        } catch (IOException e) {
            Assertions.assertEquals(null, e);
        }
    }

    @Test
    void factorial_of_negative_do_not_exist() {
        try {
            Assertions.assertEquals(Factorial.getFactorialOf(-1), 1, "factorial of any negative do not exist");
        } catch (IOException e) {
            Assertions.assertNotEquals(null, e);
            Assertions.assertEquals("Factorial of a negative number do not exist", e.getMessage());
        }
    }

    @Test
    void factorial_of_positive_more_than_one() {
        try {
            Assertions.assertTrue(Factorial.getFactorialOf(10) > 1, "factorial of any positive number should be more than one");
        } catch (IOException e) {
            Assertions.assertEquals(null, e);
        }
    }
}