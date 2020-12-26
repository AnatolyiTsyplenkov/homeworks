package part1.lesson1;

public class Task7 {

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void main(String[] args) {

        hello("Анатолий");



    }

    private static void hello(String name) {

        System.out.println("Привет, " + name + "!");

    }

}
