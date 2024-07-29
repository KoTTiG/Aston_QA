import static org.junit.jupiter.api.Assertions.*;

import org.example.Factorial;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FactorialTest {


    @Test
    public void test1() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(5);
        int expected = 120;
        assertEquals(actual, expected);

    }

    @Test
    public void test2() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(0);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @Test
    public void test3() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(-5);
        int expected = -1;
        assertEquals(actual, expected);

    }
}
