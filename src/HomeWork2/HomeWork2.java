package HomeWork2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        invertArray(); // 1)

        fillArray(); // 2)

        changeArray(); // 3)

        fillDiagonal(); // 4)

        fiendMaxAndMinCount(); // 5)

    }

// 1)Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {  // или можно тернарным решить arr[i] = ([i] == 0) ? 1 : 0;
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("After:  " + Arrays.toString(arr));
    }
// 2)Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями
// 0 3 6 9 12 15 18 21;

    public static void fillArray() {
        int[] secondArr = new int[8];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = i * 3;
        }
        System.out.println("2. " + Arrays.toString(secondArr));
    }

// 3)Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
// умножить на 2;

    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
        }
        System.out.println("3. " + Arrays.toString(w));
    }
//  4)Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//  одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        System.out.println("\r\n4 - задание:");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
//  5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
//  помощи интернета);
    public static void fiendMaxAndMinCount() {
        System.out.println("\r\n5 - задание:");
        int[] arr5 = {14, 2, 10, 3, 9, 7, 8, 21, 5, 12};
        int min = arr5[0], max = arr5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                indMax = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " +
                indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " +
                indMin + " со значением  = " + min);
    }
}
