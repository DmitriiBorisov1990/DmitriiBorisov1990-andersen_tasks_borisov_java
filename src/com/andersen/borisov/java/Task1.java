package com.andersen.borisov.java;

import com.andersen.borisov.java.utility.Utility;

public class Task1 {

    private static final String HELLO_TEXT = "Привет";

    public static void main(String[] args) {
        startTask1();
    }

    private static void startTask1() {
        System.out.println("Enter the number :");
        String result = Utility.scanner();
        try {
            int number = Integer.parseInt(result);
            if (number > 7) {
                System.out.println(HELLO_TEXT);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter number! You entered a wrong value!");
        }
    }
}
