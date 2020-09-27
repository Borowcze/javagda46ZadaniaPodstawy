package SDA.javagda.basic.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {



        stoperTimer();
    }

    private static void stoperTimer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To start timer press ENTER");
        scanner.nextLine();

        LocalDateTime startTime = LocalDateTime.now();

        LocalDateTime time = LocalDateTime.now();
        int start = time.getSecond();

        System.out.println("To stop timer press ENTER");
        scanner.nextLine();
        LocalDateTime stopTime = LocalDateTime.now();

        time = LocalDateTime.now();
        int stop = time.getSecond();

        Duration duration = Duration.between(startTime, stopTime);

        System.out.println("Your time: " + (stop - start));
        System.out.println(duration.getSeconds());

    }
}
