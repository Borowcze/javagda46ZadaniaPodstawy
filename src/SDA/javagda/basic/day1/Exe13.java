package SDA.javagda.basic.day1;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {

        enterDigit();
    }
    static int counter = 0;
    static int isPositiv = 0;
    static int sum = 0;
    static Scanner scanner = new Scanner(System.in);

    private static void enterDigit() {
        while(true){
            System.out.print("Please insert digit: ");
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }
            sum += number;
            if(number>0){
                isPositiv++;
            }
            counter++;
        }
        double artmeticAverage = (double) sum/counter;
        System.out.println("Number of digits: " + counter);
        System.out.println("Number of Positiv digits: " + isPositiv);
        System.out.println("Aritmetic Average: " + artmeticAverage);

    }

}
