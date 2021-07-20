package com.andersen.borisov.java;

public class Task1CommandLine {

    private static final String HELLO_TEXT = "Привет";

    /**
     * способ 1:
     * для запуска данной программы перейдите в Run => Edit Configuration =>
     * и введите значение в поле Program arguments
     * <p>
     * способ 2:
     * из корня проекта вызвать командную строку
     * выполнить javac -classpath ./classes -d ./classes src/com/andersen/borisov/java/Task1CommandLine.java
     * выполнить java -classpath ./classes com.andersen.borisov.java.Task1CommandLine "ваше число".
     */
    public static void main(String[] args) {
        for (String arg : args) {
            checkNumber(arg.trim());
        }
    }

    private static void checkNumber(String argValue) {

        try {
            int tempValue = Integer.parseInt(argValue);
            if (tempValue > 7) {
                System.out.println(HELLO_TEXT);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
