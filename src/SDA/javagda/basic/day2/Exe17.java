package SDA.javagda.basic.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        giveTenInt(10);
    }

    private static void giveTenInt(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfElements];


        for(int i = 0; i < numberOfElements; i++){
            System.out.println("Insert number "+ (i+1)+": ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}