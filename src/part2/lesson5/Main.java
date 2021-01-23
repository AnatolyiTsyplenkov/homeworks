package part2.lesson5;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    static final int h = SIZE / 2;

    public static void main(String[] args) {

        singleThreadedMethod();
        multiThreadedMethod();

    }

    private static void singleThreadedMethod() {
        float[] arr = createArr();
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Выполнение в однопоточном режиме: " + (System.currentTimeMillis() - a) + " миллесекунд");

    }

    private static void multiThreadedMethod() {

        float[] arr = createArr();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + (a2.length + i) / 5) * Math.cos(0.2f + (a2.length + i) / 5) * Math.cos(0.4f + (a2.length + i) / 2));
            }

        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("Выполнение в многопоточном режиме: " + (System.currentTimeMillis() - a) + " миллесекунд");

    }

    private static float[] createArr() {
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1);
        return arr;
    }
}
