package org.example;

public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                System.out.println("На ноль делить нельзя!");
                return;
            } else {
                result = a / b;

            }
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Вы используете неверный знак, используйте другой математический знак!");
            return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }

}