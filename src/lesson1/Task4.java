package lesson1;

public class Task4 {

//4. Написать метод, принимающий на вход два числа,
// и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;

    public static void main(String[] args) {

        System.out.println(checkSumma(10, 0));

    }

    private static boolean checkSumma(int a, int b) {

        return (a + b) > 10 && (a + b) <= 20;

    }

}
