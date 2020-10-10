package SDA.javagda.basic.day2;

import java.io.InputStream;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(howManySpacesInSentence("Kamil Slimak i Justynka Sosnowska"));
    }

    private static float howManySpacesInSentence(String sentence) {
        char space = ' ';
        float counter = 0;
        float sentenceLength = sentence.length();
//        if(sentence.isEmpty()){
//            return 0;
//        }
        for(int i = 0; i < sentence.length(); i++){
            char text =sentence.charAt(i);
            if(space == text){
                counter++;
            }
        }
        float result = (counter/sentenceLength)*100;
        return result;
    }
}
