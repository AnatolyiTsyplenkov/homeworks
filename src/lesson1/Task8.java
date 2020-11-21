package lesson1;

public class Task8 {

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void main(String[] args) {

        checkLeapYear(1900);

    }

    private static void checkLeapYear(int year) {

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {

            System.out.println("Високосный год");

        } else {

            System.out.println("Не високосный год");

        }

    }

}
