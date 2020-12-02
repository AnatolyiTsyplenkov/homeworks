package lesson3;

import java.util.Scanner;

public class Task1 {

    //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {

        startGame();

    }

    private static int generateRandomNumber(int startNumber, int endNumber) {

        return (startNumber + (int) (Math.random() * endNumber));

    }

    private static int userInputReader() {

        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.hasNextInt() ? scanner.nextInt() : -10000;

        return userInputNumber;
    }

    private static void showErrMsg(int userInputNumber, int generateNumber) {

        System.out.println((userInputNumber < generateNumber) ? "Вы ввели меньшее число, чем загаданное \n" : "Вы ввели большее число, чем загаданное \n");

    }

    private static boolean checkUserNumber(int userInputNumber, int generateNumber) {

        if (userInputNumber == generateNumber) {

           return true;

        } else {

            showErrMsg(userInputNumber, generateNumber);

            return false;

        }

    }

    private static int repeatGameQuestion() {

        System.out.print("Вы хотите повторить игру? (1 – да / 0 – нет): ");
        int result = userInputReader();
        return result;

    }

    private static void startGame() {

        final int numberOfAttempts = 3;
        final int hiddenNumber = generateRandomNumber(0, 10);

        System.out.println("ИГРА НАЧАЛАСЬ! ПОЕХАЛИ!\n");

        for (int i = 0; i < numberOfAttempts; i++) {

            System.out.print("Введите значение от 0 до 9: ");

            int userInputNumber = userInputReader();

            if (userInputNumber == -10000) {

                System.out.println("Вам необхоимо ввести ЦЕЛОЕ ЧИСЛО!\n");

            } else if (checkUserNumber(userInputNumber, hiddenNumber)){

                System.out.println("Урааа!Вы угадали!!!\n");
                break;

            }

            System.out.println("ОСТАЛОСЬ ПОПЫТОК: " + (numberOfAttempts - (i + 1)) + "\n");

        }

        int repeatGame = repeatGameQuestion();

        if (repeatGame == 1) {

            startGame();

        } else {

            System.out.println("КОНЕЦ! СПАСИБО ЗА ИГРУ!");

        }

    }

}
