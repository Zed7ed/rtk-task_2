package org.example;

import java.util.Random;

public class GuessNumber2 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // +1 нужно, т.к. иначе будет интервал (0;99]
        //System.out.println("Загаданное число: " + secretNumber);
        int playerNumber;

        if (secretNumber > 0 && secretNumber < 25) {
            playerNumber = 13;
        } else if (secretNumber >= 25 && secretNumber < 50) {
            playerNumber = 38;
        } else if (secretNumber >= 50 && secretNumber < 75) {
            playerNumber = 63;
        } else {
            playerNumber = 88;
        }

        while (playerNumber != secretNumber) {
            if (playerNumber > secretNumber) {
                System.out.println("Число " + playerNumber + " больше, чем загадал компьютер");
                playerNumber--;
            } else if (playerNumber < secretNumber) {
                System.out.println("Число " + playerNumber + " меньше, чем загадал компьютер");
                playerNumber++;
            }
        }

        System.out.println("Вы победили! Загаданное число: " + secretNumber);
    }
}