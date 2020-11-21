package lesson1;

public class Task5 {

    //    5. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
//    Замечание: ноль считаем положительным числом.

    public static void main(String[] args) {

        checkNumForPositive(0);

    }

    private static void checkNumForPositive(int num) {

        if (num >= 0) {

            System.out.println("Число " + num + " является положительным!");

        } else {

            System.out.println("Число " + num + " является отрицательным!");

        }

    }
}
