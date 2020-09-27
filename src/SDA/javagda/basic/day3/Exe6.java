package SDA.javagda.basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe6 {
    public static void main(String[] args) {

        System.out.println(isCorrect("a psik"));
        System.out.println(isCorrect("aaa psik"));
        System.out.println(isCorrect("psik"));
        System.out.println(isCorrect("b psik"));
        System.out.println(isCorrect("a pisk"));
    }

    private static boolean isCorrect(String text) {
        String regex = "a+ (psik|Psik)";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matches(regex,text);

//        Matcher matcher = pattern.matcher(text);
//        return matcher.matches();
    }
}
