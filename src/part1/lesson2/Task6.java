package part1.lesson2;

public class Task6 {

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 1};


        System.out.println(checkBalance(arr));

    }

    public static boolean checkBalance(int[] arr) {

        int sumLeft = 0;
        int sumRight = 0;
        int size = arr.length;
        boolean result = false;

        for (int i = 0; i < size; i++) {

            sumLeft = sumLeft + arr[i];

            for (int j = i + 1; j < size; j++) {

                sumRight = sumRight + arr[j];

            }

            if (sumLeft == sumRight) {

                result = true;
                break;

            }

            sumRight = 0;

        }

        return result;
    }


}
