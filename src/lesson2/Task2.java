package lesson2;

import java.util.Arrays;

public class Task2 {

//    2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void main(String[] args) {

        int[] arr = new int[8];

        int a = 0; // значение первого элемента массива
        final int B = 3; // величина приращения последующих элементов массива по отношению к предыдущему

        for (int i = 0; i < arr.length; i++) {

            arr[i] = a;
            a = a + B;

        }

        System.out.println(Arrays.toString(arr));

    }

}
