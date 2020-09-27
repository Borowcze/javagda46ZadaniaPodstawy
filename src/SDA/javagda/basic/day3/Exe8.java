package SDA.javagda.basic.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {

        giveNextExerciseDate();
    }

    public static void giveNextExerciseDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date in format [yyyy-MM-dd HH:mm:ss]:");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLesson = LocalDateTime.parse(input,formatter);

        LocalDateTime now = LocalDateTime.now();
        long days = Duration.between(now, nextLesson).toDays();

        System.out.println(String.format("You have %d days to the next lesson", days));
        System.out.println("You have " + days + " days to the next lesson");

        // TimeUnit. skorzystac

    }
}
