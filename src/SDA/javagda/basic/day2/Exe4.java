package SDA.javagda.basic.day2;

public class Exe4 {
    public static void main(String[] args) {
    replaceString("Ala ma,kota.a kot,ma Ale");
    }

    private static void replaceString(String sentence) {
        String result = sentence.replace(",","-STOP-").replace(".","-STOP-");
        System.out.println(result);
    }
}
