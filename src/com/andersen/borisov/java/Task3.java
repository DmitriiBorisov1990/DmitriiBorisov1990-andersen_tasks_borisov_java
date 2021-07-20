package com.andersen.borisov.java;

import com.andersen.borisov.java.utility.Utility;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        showNumberMultiplesOfThree(randomArrayValue());
    }

    private static int[] randomArrayValue() {
        int[] array = new int[Utility.randomNumberGenerator()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Utility.randomNumberGenerator();
        }
        return array;
    }

    private static void showNumberMultiplesOfThree(int[] array) {
        int counter = 1;
        showRandomArrayInfo(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] != 0) {
                System.out.print(array[i] + ";");
                if (counter % 5 == 0) {
                    System.out.println();
                }
                counter++;
            }
        }
    }

    private static void showRandomArrayInfo(int[] array) {
        System.out.println("Array length : " + array.length);
        System.out.println(Arrays.toString(array));
    }
}
