package org.example;

import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // +1 нужно, т.к. иначе будет интервал (0;99]
        int playerNumber = 1;
        while (playerNumber != secretNumber) {
            if (playerNumber > secretNumber) {
                System.out.println("Число " + playerNumber + " больше, чем загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " меньше, чем загадал компьютер");
            }
            playerNumber++;
        }
        System.out.println("Вы победили!");
    }
}