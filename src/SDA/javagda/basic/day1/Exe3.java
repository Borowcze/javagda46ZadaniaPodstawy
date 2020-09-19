package SDA.javagda.basic.day1;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę x i y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Liczba x to: "+x+" , a liczba y to: "+y);

        boolean result = false;
        result = x > y ? true : false;
        System.out.println("if x is greater than y: "+result);

        result = x*3>y ? true : false;
        System.out.println("if x multiply by 3 is bigger than y: "+result);

        result = y++<++x && --x<y++ ? true: false;
        System.out.println(result);
        System.out.println(x + "  "+y);
        result = (x*y)%2==0 ? true: false;
        System.out.println(result);

    }
}
