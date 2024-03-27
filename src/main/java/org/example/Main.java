package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Factorial.getFactorialOf(4));
            System.out.println(Factorial.getFactorialOf(-4));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}