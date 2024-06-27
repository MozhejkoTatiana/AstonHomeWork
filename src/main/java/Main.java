public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},

        };
        try {
            Lesson_12.checkArraySize(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            int sum = Lesson_12.sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}



