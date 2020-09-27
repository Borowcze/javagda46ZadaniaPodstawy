package SDA.javagda.basic.day1;

import java.util.Random;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        guessTheNumber(randomNumber.nextInt(100));
    }

    private static void guessTheNumber(int number) {
        System.out.print("Zgadnij liczbę z zakresu od 0 do 100 ");
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        while (result) {
            System.out.print("Please insert digit: ");
            int guessNumber = scanner.nextInt();
            if (guessNumber == number) {
                System.out.println("Bingo");
                break;
            }
            else if(guessNumber<number){
                System.out.println("not enough");
            }
            else {
                System.out.println("too much");
            }
        }
    }
}
