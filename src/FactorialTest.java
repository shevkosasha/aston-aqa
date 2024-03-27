import org.junit.Assert;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial_of_zero_is_one() {
        try {
            Assert.assertEquals("factorial of zero should be one", Factorial.getFactorialOf(0), 1);
        } catch (IOException e) {
            Assert.assertEquals(null, e);
        }
    }

    @org.junit.jupiter.api.Test
    void factorial_of_one_is_one() {
        try {
            Assert.assertEquals("factorial of one should be one",Factorial.getFactorialOf(1), 1);
        } catch (IOException e) {
            Assert.assertEquals(null, e);
        }
    }

    @org.junit.jupiter.api.Test
    void factorial_of_negative_do_not_exist() {
        try {
            Assert.assertEquals("factorial of any negative do not exist",Factorial.getFactorialOf(-1), 1);
        } catch (IOException e) {
            Assert.assertNotEquals(null, e);
            Assert.assertEquals("Factorial of a negative number do not exist", e.getMessage());
        }
    }
    @org.junit.jupiter.api.Test
    void factorial_of_positive_more_than_one() {
        try {
            Assert.assertTrue("factorial of any positive number should be more than one",Factorial.getFactorialOf(10) > 1);
        } catch (IOException e) {
            Assert.assertNotEquals(null, e);
            Assert.assertEquals("Factorial of a negative number do not exist", e.getMessage());
        }
    }
}