
import org.example.Factorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class FactorialTest{
    private final Map<Integer, Integer> testData = new HashMap<>();

    @DataProvider
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1},
                {5, 120},
                //{-1, expectThrows(new ArithmeticException(""))}
        };
    }

    @Test (dataProvider = "factorialData")
    public  void factorialTest(int value, int expected){
        assertEquals(Factorial.factorial(value), expected);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void factorialExceptionTest() {
        Factorial.factorial(-1);
    }

}
