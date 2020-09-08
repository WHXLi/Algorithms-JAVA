package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int[] myArray = new int[400];

    public static void main(String[] args) {
        // 2.1 и 2.3
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt(100);
        }
        long a = System.nanoTime();
        Arrays.sort(myArray);
        System.out.println("Отсортированный sort(): " + Arrays.toString(myArray));
        long b = System.nanoTime();
        System.out.println(" - время выполнения: " + (b - a));

        // 2.2
        linearSearch(100);
        linearSearch(4);

        // 2.4
        bubbleSort();

        // 2.5
        chooseSort();

        // 2.6
        pastSort();
    }

    private static void linearSearch(int key) {
        long a = System.nanoTime();
        for (int i : myArray) {
            if (i == key) {
                long b = System.nanoTime();
                System.out.println("Число нашлось: " + key + " - время выполнения: " + (b - a));
                return;
            }
        }
        long b = System.nanoTime();
        System.out.println("Числа нет в массиве: " + key + " - время выполнения: " + (b - a));
    }

    private static void swap(int first, int second) {
        int buff = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = buff;
    }

    private static void bubbleSort() {
        long a = System.nanoTime();
        for (int i = myArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        System.out.println("Отсортированный пузырьком: " + Arrays.toString(myArray));
        long b = System.nanoTime();
        System.out.println(" - время выполнения: " + (b - a));
    }

    private static void chooseSort() {
        long a = System.nanoTime();
        for (int i = 0; i < myArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
        System.out.println("Отсортированный методом выбора: " + Arrays.toString(myArray));
        long b = System.nanoTime();
        System.out.println(" - время выполнения: " + (b - a));
    }

    private static void pastSort(){
        int in;
        int buff;
        long a = System.nanoTime();
        for (int i = 1; i < myArray.length; i++) {
            buff = myArray[i];
            in = i;
            while (in > 0 && myArray[in-1] >= buff){
                myArray[in] = myArray[in - 1];
                -- in;
            }
            myArray[in] = buff;
        }
        System.out.println("Отсортированный методом вставки: " + Arrays.toString(myArray));
        long b = System.nanoTime();
        System.out.println(" - время выполнения: " + (b - a));
    }
}
