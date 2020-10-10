package SDA.javagda.basic.day2;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        lastCharacterToWord(number);
    }

    public static void lastCharacterToWord(int number){
        char [] arrays = new char[number];
        Scanner word = new Scanner(System.in);

        int lastCharPosition = 0;
        for(int i = 0; i < number; i++){
            System.out.print("Podaj słowo: ");
            String text = word.nextLine();
            lastCharPosition = text.length() - 1;
            arrays[i] = text.charAt(lastCharPosition);
        }
        for (char lastChar : arrays) {
            System.out.print(lastChar);
        }
    }
}
