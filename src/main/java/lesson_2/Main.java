package lesson_2;

import java.util.Arrays;

import static lesson_2.L2.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        printThreeWords();

        //Задание 2
        checkSumSign();

        //Задание 3
        printColor();

        //Задание 4
        compareNumbers();

        //Задание 5
        System.out.println(isSumBetween10and20(1, 2));

        //Задание 6
        isNumberPositiveOrNegative(3);

        //Задание 7
        System.out.println(isPositiveOrNegative(7));

        //Задание 8
        printTextNTimes("Hello", 5);

        //Задание 9
        System.out.println(isleapYearOrNot(2023));

        //Задание 10
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        reversArray(arr);

        //Задание 11
        fillArray();

        //Задание 12
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        numbersLess6Multiply2Array(arr2);

        //Задание 13
        diagonalArray(5, 5);

        //Задание 14
        System.out.print(Arrays.toString(printArr(5, 3)));
    }
}