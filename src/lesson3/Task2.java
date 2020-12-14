package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*
    2 * Создать массив из слов
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
    "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.

    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы*/

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        starGame(words);

    }

    private static String randomWord(String[] words) {

        int minIndexWord = 0;
        int maxIndexWord = words.length - 1;
        int randomIndexWord = minIndexWord + (int) (Math.random() * maxIndexWord);

        return words[randomIndexWord];

    }

    private static String userInputReader() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().toLowerCase();
    }

    private static boolean checkUserWord(String randomWord, String userInputWord) {

        return randomWord.equals(userInputWord);

    }

    private static String mystificationTrueAnswer(String randomWord, String userInputWord) {

        StringBuilder mystificationWord = new StringBuilder();
        int mystificationWordLenght = 15;

        int randomWordLenght = randomWord.length();
        int userInputWordLenght = userInputWord.length();

        char mystificationSymbol = 'x';

        char symbolRandomWord;
        char symbolUserInputWord;

        int loopLenght = Math.min(randomWordLenght, userInputWordLenght);


        for (int i = 0; i < loopLenght; i++) {

            symbolRandomWord = randomWord.charAt(i);
            symbolUserInputWord = userInputWord.charAt(i);

            if (symbolRandomWord == symbolUserInputWord) {

                mystificationWord.append(symbolRandomWord);

            } else {

                mystificationWord.append(mystificationSymbol);

            }

        }

        if (mystificationWord.length() <= mystificationWordLenght) {

            for (int j = mystificationWord.length(); j < mystificationWordLenght; j++) {

                mystificationWord.append(mystificationSymbol);

            }

        }
        return mystificationWord.toString();
    }



    private static void starGame(String[] words) {

        System.out.println("НАЧАЛО ИГРЫ!!!");
        System.out.println("Есть список слов:");
        System.out.println(Arrays.toString(words) + "\n");
        System.out.println("Компьютер загадал одно из этих слов!!!\n");
        System.out.println("Угадайте это слово: ");

        String randomWord = randomWord(words);
        System.out.println(randomWord);

        while (true) {

            String userWord = userInputReader();

            if (checkUserWord(randomWord, userWord)) {

                System.out.println("УРААА!!!ВЫ УГАДАЛИ!!!");
                break;

            } else {

                System.out.println("Упс!!!Неправильно");
                System.out.println("Вот подсказка");
                System.out.println(mystificationTrueAnswer(randomWord, userWord));

                System.out.println("\nПопробуйте еще разок: ");

            }

        }

    }
}
