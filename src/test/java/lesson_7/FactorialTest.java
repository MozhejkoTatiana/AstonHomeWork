package lesson_7;

import feature.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialTest {
    @ParameterizedTest
    @CsvSource({"1,0", "1,1", "120,5"})
    @DisplayName("Проверка правильности расчета факториала")
    public void checkFactorialTest2(int expected, int value) {
        Assertions.assertEquals(expected, Factorial.calculateFactorial(value), "Факториал  должен быть равен " + expected);
    }
}


