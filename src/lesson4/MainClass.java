package lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int SIZE = 10;
    public static int DOTS_TO_WIN = 9;
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        return DiagonalRightCheck(symb) || diagonalLeftCheck(symb) || columnCheck(symb) || lineCheck(symb);
    }

    private static boolean lineCheck(char symb) {
        boolean result = false;
        int lineCheck = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    lineCheck = lineCheck + 1;//00,01,02   10,11,12   20,21,22
                } else lineCheck = 0;
                if (lineCheck >= DOTS_TO_WIN) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    private static boolean columnCheck(char symb) {
        boolean result = false;
        int columnCheck = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {// 00,10,20  01,11,21   02,12,22
                    columnCheck = columnCheck + 1;
                } else columnCheck = 0;

                if (columnCheck >= DOTS_TO_WIN) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean diagonalLeftCheck(char symb) {
        int diagonalLeftCheck = 0;
        boolean result = false;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {//00,11,22
                diagonalLeftCheck = diagonalLeftCheck + 1;
            }
        }

        if (diagonalLeftCheck >= DOTS_TO_WIN) {
            result = true;
        }
        return result;
    }


    private static boolean DiagonalRightCheck(char symb) {
        int diagonalRightCheck = 0;
        int iterator = 0;
        boolean result = false;

        for (int i = SIZE - 1; i >= 0; i--) {
            if (map[i][iterator] == symb) {// 20,11,02
                diagonalRightCheck = diagonalRightCheck + 1;
            }
            iterator = iterator + 1;
        }

        if (diagonalRightCheck >= DOTS_TO_WIN) {
            result = true;
        }

        return result;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
