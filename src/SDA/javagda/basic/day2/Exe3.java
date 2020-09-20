package SDA.javagda.basic.day2;

public class Exe3 {
    public static void main(String[] args) {
        int number = getIndex("ala ma kota", "");
        System.out.println(getIndex("ala ma kota", "kota"));
        System.out.println(getIndex("ala ma kota", "psa"));
        System.out.println(getIndex("ala ma kota", "ma"));
        System.out.println(getIndex("ala ma kota", ""));
        System.out.println(getIndex("ala ma kota", "la ma"));
    }

    private static int getIndex(String sentence, String word) {
        if(word.isEmpty()){
            return -1;
        }
        return sentence.contains(word) ? sentence.indexOf(word) : -1;
    }


}
