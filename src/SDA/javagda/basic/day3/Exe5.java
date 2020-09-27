package SDA.javagda.basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe5 {
    public static void main(String[] args) {

        System.out.println(isCorrect("-1234,1234"));
        System.out.println(isCorrect("1234a1234"));
        System.out.println(isCorrect("1234"));
        System.out.println(isCorrect("-1234"));

    }

    public static boolean isCorrect(String text) {
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
