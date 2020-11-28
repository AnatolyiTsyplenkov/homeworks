package lesson2;

import java.util.Arrays;

public class Task5 {
    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void main(String[] args) {

        final int ARRLENGHT = 10;//длина массива
        int[] arr = new int[ARRLENGHT];//создаем массив

        int minArrElement = -10;
        int maxArrElement = 100;

        //инициализируем массив случайными числами от minArrElement до maxArrElement
        for (int i = 0; i < ARRLENGHT; i++) {

            arr[i] = minArrElement + (int) (Math.random() * (maxArrElement));

        }

        int max = arr[0];// максимальный элементт массива
        int min = arr[0];// минимальный элементт массива

        //ищем мин и макс элементы массива
        for (int i = 0; i < ARRLENGHT; i++) {

            if (arr[i] > max) {

                max = arr[i];

            } else if (arr[i] < min){

                min = arr[i];

            }

        }

        //выводим результат в консоль
        System.out.println(Arrays.toString(arr));
        System.out.println("минимальный элемент массива = " + min);
        System.out.println("максимальный элемент массива = " + max);

    }

}
