import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    void factorial_of_zero_is_one() {
        try {
            Assert.assertEquals(Factorial.getFactorialOf(0), 1, "factorial of zero should be one");
        } catch (IOException e) {
            Assert.assertEquals(null, e);
        }
    }

    @Test
    void factorial_of_one_is_one() {
        try {
            Assert.assertEquals(Factorial.getFactorialOf(1), 1, "factorial of one should be one");
        } catch (IOException e) {
            Assert.assertEquals(null, e);
        }
    }

    @Test
    void factorial_of_negative_do_not_exist() {
        try {
            Assert.assertEquals(Factorial.getFactorialOf(-1), 1, "factorial of any negative should not exist");
        } catch (IOException e) {
            Assert.assertNotEquals(null, e);
            Assert.assertEquals("Factorial of a negative number do not exist", e.getMessage());
        }
    }
    @Test
    void factorial_of_positive_more_than_one() {
        try {
            Assert.assertTrue(Factorial.getFactorialOf(10) > 1, "factorial of any positive number should be more than one");
        } catch (IOException e) {
            Assert.assertEquals(null, e);
        }
    }
}