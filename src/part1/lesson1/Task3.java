package part1.lesson1;

public abstract class Task3 {

    public static void main(String[] args) {

        System.out.println(calculateExpression(1, 2, 3, 4));

    }

    private static double calculateExpression(int a, int b, int c, int d) {

        return a * (b + ((double) c / d));

    }

}
