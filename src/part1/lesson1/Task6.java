package part1.lesson1;

public class Task6 {

    //6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;

    public static void main(String[] args) {

        System.out.println(checkNumForNegative(-1));

    }

    private static boolean checkNumForNegative(int num) {

        return num < 0;

    }

}
