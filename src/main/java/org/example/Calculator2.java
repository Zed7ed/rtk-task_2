package org.example;

import java.util.Random;

public class Calculator2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(51);
        int operator = random.nextInt(6);

        int result = 0;
        String sign = "";

        if (operator == 0) {
            result = a + b;
            sign = "+";
        } else if (operator == 1) {
            result = a - b;
            sign = "-";
        } else if (operator == 2) {
            result = a * b;
            sign = "*";
        } else if (operator == 3) {
            if (b == 0) {
                System.out.println("На ноль делить нельзя!");
                return;
            } else {
                result = a / b;
                sign = "/";
            }
        } else if (operator == 4) {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            sign = "^";
        } else if (operator == 5) {
            result = a % b;
            sign = "%";
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}