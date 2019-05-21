package org.itstep;

public class ApplicationRunner {

    String text;

    public static void main(String[] args) {
        someMethod("Hi! My name is Ivan!");
    }

    static void someMethod(String msg) {
        System.out.println(msg);

    }
}