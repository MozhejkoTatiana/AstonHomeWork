package feature;

public class Factorial {
    public static long calculateFactorial(int n) {
        if (n >= 0) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } else throw new IllegalArgumentException("Число должно быть >= 0");

    }

}