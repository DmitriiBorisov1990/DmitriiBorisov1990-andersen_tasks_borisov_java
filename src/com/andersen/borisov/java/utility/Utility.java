package com.andersen.borisov.java.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {

    private Utility() {

    }


    public static String scanner() {
        Scanner scannerName = new Scanner(System.in);
        String result = scannerName.next();
        return result.trim();
    }

    /**
     * @return random number between [0,49]
     */
    public static int randomNumberGenerator() {
        Random random = new Random();
        return random.nextInt(50);
    }
}
