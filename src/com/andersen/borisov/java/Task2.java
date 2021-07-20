package com.andersen.borisov.java;

import com.andersen.borisov.java.utility.Utility;

public class Task2 {

    private static final String NAME_VALUE = "Вячеслав";
    private static final String POSITIVE_RESULT = "Привет, Вячеслав";
    private static final String NEGATIVE_RESULT = "Нет такого имени";

    public static void main(String[] args) {
        checkName();
    }

    private static void checkName() {
        System.out.println("Enter the name :");
        String value = Utility.scanner();
        switch (value) {
            case NAME_VALUE:
                System.out.println(POSITIVE_RESULT);
                break;
            default:
                System.out.println(NEGATIVE_RESULT);
        }
    }
}
