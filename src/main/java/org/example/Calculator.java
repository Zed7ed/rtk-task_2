package org.example;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        char sign = '^';
        int result;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++)
            {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Вы используете неверный знак, используйте другой математический знак");
            return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
        }

    }

