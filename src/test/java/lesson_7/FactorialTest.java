package lesson_7;

import feature.Factorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @DataProvider
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1}, {1, 1}, {5, 120},
        };
    }

    @Test(dataProvider = "factorialData")
    public void checkFactorialTest(int value, long expected) {
        assertEquals(Factorial.calculateFactorial(value), expected, "Факториал должен быть равен " + expected);
    }
}
