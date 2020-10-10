package SDA.javagda.basic.day2;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        System.out.println(longestInputWord());
    }


    private static String longestInputWord() {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        boolean b = true;
        while(b){
                System.out.println("Please insert your text: ");
                String word = scanner.nextLine();
                if(word.contains("Enough")){
                    return longest;
                }

                if(word.length()==0){
                    System.out.println("No input");
                } else if(word.length()>longest.length()){
                    longest = word;
                }
        }
        return "nothing";
    }
}

