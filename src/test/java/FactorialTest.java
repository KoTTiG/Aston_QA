
import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

class FactorialTest extends Assert {
    private final Map<Integer, Integer> testData = new HashMap<>();

    @BeforeClass
    public void setUp() {
        testData.put(5, 120);
        testData.put(0, 1);
        testData.put(-5, -1);
    }

    @Test
    public  void factorialTest(){
        for (Map.Entry<Integer,Integer> data : testData.entrySet()){
            final int actual = data.getValue();
            final int expected = Factorial.factorial(data.getKey());

            assertEquals(actual,expected);
        }
    }
}
