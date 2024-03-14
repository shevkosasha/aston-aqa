import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1
        printThreeWords();
        // 2
        checkSumSign();
        // 3
        printColor();
        // 4
        compareNumbers();
        // 5
        System.out.println((isBetweenTenAndTwenty(15,5)));
        // 6
        isEven(1);
        // 7
        System.out.println(isNegative(15));
        // 8
        printWordNTimes("word", 0);
        // 9
        System.out.println(isLeapYear(1900));
        // 10
        System.out.println(Arrays.toString(reverse()));
        // 11
        System.out.println(Arrays.toString(populateArray()));
        // 12
        System.out.println(Arrays.toString(multiplyArray()));
        // 13
        populate2DArray();
        // 14
        System.out.println(Arrays.toString(getPrefilledStringArray(15, "str")));
    }

    private static String[] getPrefilledStringArray(int len, String value) {
        String array[] = new String[len];
        for (int i = 0; i < len; i++){
            array[i] = value;
        }
        return array;
    }

    private static int[] multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }
        return arr;
    }

    private static int[] populateArray() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[][] populate2DArray() {
        int size = 15;
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (i == j || j == array.length - i - 1) ? 1 : 0;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }

    private static int[] reverse() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        return array;
    }

    private static boolean isLeapYear(int year) {
        return  (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    private static void printWordNTimes(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    private static boolean isNegative(int num) {
        return num < 0;
    }

    private static void isEven(int num) {
        System.out.println(num % 2 == 0);
    }

    private static Boolean isBetweenTenAndTwenty(int a, int b) {
        int sum = a + b;
        return sum >=10 && sum <=20;
    }

    private static void compareNumbers() {
        int a = 5, b = 10;
        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void checkSumSign() {
        int a = 5, b = 0;
        String result = a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    private static void printThreeWords() {
        List<String> words = Arrays.asList("Orange", "Banana", "Apple");
        for ( String word : words) {
            System.out.println(word);
        }
    }
}