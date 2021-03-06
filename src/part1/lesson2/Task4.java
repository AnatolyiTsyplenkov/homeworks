package part1.lesson2;

public class Task4 {
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void main(String[] args) {

        final int SIZE = 5;//количество строк и столбцов в квадрате
        int n = 1;//число каким будем заполнять диагонали массива

        int[][] arr = new int[SIZE][SIZE];//объявляем массив

        //заполняем диагональ квадрата с лева на право
        for (int i = 0; i < SIZE; i++) {

            arr[i][i] = n;

        }

        int a = SIZE - 1;//для опеределения правой верхней ячейки

        //заполнем диагональ квадрата с права на лево
        for (int i = 0; i < SIZE; i++) {


            arr[i][a] = n;
            a = a - 1;

        }

        //выводим в консоль квадрат с заполненными диагоналями
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                System.out.printf("%2d", arr[i][j]);

            }
            System.out.println();
        }

    }

}
