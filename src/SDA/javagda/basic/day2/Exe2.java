package SDA.javagda.basic.day2;

public class Exe2 {
    public static void main(String[] args) {
        System.out.println(ifWordContainsPrefix("programowanie", "pro"));
        System.out.println(ifWordContainsPrefix("programowanie", "nie"));
        System.out.println();
        System.out.println(ifWordContainsSuffix("programowanie", "pro"));
        System.out.println(ifWordContainsSuffix("programowanie", "nie"));
    }

    private static boolean ifWordContainsPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

    private static boolean ifWordContainsSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }


}
