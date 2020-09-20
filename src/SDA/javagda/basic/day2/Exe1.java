package SDA.javagda.basic.day2;

public class Exe1 {
    public static void main(String[] args) {

        System.out.println("Last char is: "+ getLastCharacter("domek"));
        System.out.println("Last char is: "+ getLastCharacterV2("domek dla lal"));
    }

    private static char getLastCharacter(String input) {
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }

    private static String getLastCharacterV2(String input) {
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }
}
