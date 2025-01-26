import java.util.Arrays;
public class DZ_2 {
    public static void main(String[] args) {
        // Задание1.
        printThreeWords();

        // Задание 2.
        if (checkSumSign(-10, 10) >= 0) {
            System.out.println("Задание 2: " + "Сумма положительная");
        } else {
            System.out.println("Задание 2: " + "Сумма отрицательная");
        }

        // Задание 3.
        int value = 101;
        if (printColor(value) <= 0) {
            System.out.println("Задание 3: " + "Красный");
        } else if (printColor(value) <= 100) {
            System.out.println("Задание 3: " + "Желтый");
        } else {
            System.out.println("Задание 3: " + "Зеленый");
        }

        // Задание 4.
        compareNumbers(10, 10);

        // Задание 5.
        sumNumbersLimit(5, 25);

        // Задание 6.
        numberPositiveOrNegative(0);

        // Задание 7.
        numberPositiveOrNegative2(-1);

        // Задание 8.
        System.out.println("Задание 8: ");
        printLine("Dmitry", 3);

        // Задание 9.
        checkLeapYear(2024);

        // Задание 10.
        int[] arr10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr10);
        System.out.println("Задание 10: " + Arrays.toString(arr10));

        // Задание 11.
        int[] arr11 = new int[100];
        fillArray(arr11);
        System.out.println("Задание 11: " + Arrays.toString(arr11));

        // Задание 12.
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(arr12);
        System.out.println("Задание 12: " + Arrays.toString(arr12));

        // Задание 13.
        System.out.println("Задание 13: ");
        fillDiagonal();

        // Задание 14.
        System.out.println("Задание 14: ");
        initialValueArray(5, 7);
    }

    // Задание 1.
    public static void printThreeWords() {
        System.out.println("Задание 1: ");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2.
    public static int checkSumSign (int a2, int b2) {
        return a2 + b2;
    }

    // Задание 3.
    public static int printColor (int value) {
        return value;
    }

    // Задание 4.
    public static int compareNumbers(int a4, int b4) {
        if (a4 >= b4) {
            System.out.println("Задание 4: " + "a >= b");
        } else {
            System.out.println("Задание 4: " + "a < b");
        }
        return a4;
    }

    // Задание 5.
    public static int sumNumbersLimit(int a5, int b5) {
        int c5 = a5 + b5;
        boolean d5 = (c5 >= 10) & (c5 <= 20);
        System.out.println("Задание 5: " + d5);
        return c5;
    }

    // Задание 6.
    public static int numberPositiveOrNegative (int a6) {
        if (a6 >= 0) {
            System.out.println("Задание 6: " + "Положительное число");
        } else {
            System.out.println("Задание 6: " + "Отрицательное число");
        }
        return a6;
    }

    // Задание 7.
    public static int numberPositiveOrNegative2 (int a7) {
        boolean b7 = (a7 >= 0);
        System.out.println("Задание 7: " + b7);
        return a7;
    }

    // Задание 8.
    public static void printLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }

    // Задание 9.
    public static int checkLeapYear (int a9) {
        boolean y9 = (a9 % 4 == 0 && a9 % 100 != 0 || a9 % 400 == 0);
        System.out.println("Задание 9: " + y9);
        return a9;
    }

    // Задание 10.
    public static void invertArray(int[] arr10) {
        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = (arr10[i] == 1) ? 0 : 1;
        }
    }

    // Задание 11.
    public static void fillArray(int[] arr11) {
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = i + 1;
        }
    }

    // Задание 12.
    public static void changeArray(int[] arr12) {
        for (int i = 0; i < arr12.length; i++) {
            if (arr12[i] < 6) {
                arr12[i] *= 2;
            }
        }
    }

    // Задание 13.
    public static void fillDiagonal() {
        int[][] arr13 = new int[5][5];
        for (int i = 0; i < arr13.length; i++) {
            for (int j = 0, x = arr13[i].length - 1; j < arr13[i].length; j++, x--) {
                if (i == j || i == x) arr13[i][j] = 1;
                else arr13[i][j] = 0;
                System.out.print(arr13[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // Задание 14.
    public static void initialValueArray(int len, int initialValue){
        int[] arr14 = new int[len];
        for (int i = 0; i < len; i++) {
            arr14[i] = initialValue;
            System.out.print("[" + i + "]" + arr14[i] + " ");
        }
    }
}