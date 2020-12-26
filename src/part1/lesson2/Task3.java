package part1.lesson2;

import java.util.Arrays;

public class Task3 {

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];

        }

        System.out.println(Arrays.toString(arr));

    }

}
