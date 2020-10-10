package SDA.javagda.basic.day2;

public class Exe6 {
    public static void main(String[] args) {
        indexOfChar("Ala ma kota", 'a');
        System.out.println(indexOfChar("Ala ma kota", ' '));
    }

    private static int indexOfChar(String sentence, char character) {
        if(sentence.isEmpty()){
            return -1;
        }
        for (int i = 0; i < sentence.length(); i++){
            char text = sentence.charAt(i);
            if(text == character){
                return i;
            }
        }
        return -2;
    }


}
