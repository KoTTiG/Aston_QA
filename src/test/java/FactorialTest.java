import static org.junit.jupiter.api.Assertions.*;

import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {


    @Test
    public void testFactorialPositive() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(5);
        int expected = 120;
        assertEquals(actual, expected);

    }

    @Test
    public void testFactorialZero() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(0);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @Test
    public void testFactorialNegative() {
        Factorial factorial = new Factorial();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            factorial.factorial(-5);
        });
    }
}
