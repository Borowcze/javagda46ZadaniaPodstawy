package SDA.javagda.basic.day2;

public class Exe5 {
    public static void main(String[] args) {


        int result = numberOfChar("Ala ma kota", 'a');
        System.out.println(result);
    }

    public static int numberOfChar(String sentence, char character) {
        if(sentence.isEmpty()){
            return 0;
        }
        int counter =0;
        for (int i = 0; i < sentence.length(); i++) {
            char text = sentence.charAt(i);
            if(text ==character){
                counter++;
            }
        }
        return counter;
    }
}
