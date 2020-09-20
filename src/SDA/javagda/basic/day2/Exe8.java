package SDA.javagda.basic.day2;

public class Exe8 {

    private static final int VALUE_A_ASCII = 65;
    private static final int DIFF_UPPER_AND_LOWER = 32;


    public static void main(String[] args) {
        System.out.println(replaceChars("ALa mA kOtA!"));
    }

    private static String replaceChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(character>=VALUE_A_ASCII && character<=90){
                result.append((char) (character + DIFF_UPPER_AND_LOWER));
            }else if (character >=97 && character<=122){
                result.append((char) (character - DIFF_UPPER_AND_LOWER));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
