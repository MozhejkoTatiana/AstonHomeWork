package lesson_2;

public class L2 {
    // Задание 1.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }
    // Задание 2.

    public static void checkSumSign() {
        int a = 3;
        int b = 5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3.

    public static void printColor() {
        int value = 25;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");

        }

    }

    // Задание 4.
    public static void compareNumbers() {
        int a = 33;
        int b = 88;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5.
    public static boolean isSumBetween10and20(int a, int b) {
        int sum = a + b;
        boolean result;
        if (sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // Задание 6.
    public static void isNumberPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // Задание 7.
    public static boolean isPositiveOrNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 8.
    public static void printTextNTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }

    }

    //Задание 9.
    public static boolean isleapYearOrNot(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 10.
    public static void reversArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    //Задание 11.
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    //Задание 12.
    public static void numbersLess6Multiply2Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            }
        }


    }

    //Задание 13.
    public static void diagonalArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                if (i + j == x - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 14.
    public static int[] printArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
