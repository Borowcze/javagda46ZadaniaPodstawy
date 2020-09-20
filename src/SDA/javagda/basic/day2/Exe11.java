package SDA.javagda.basic.day2;

public class Exe11 {
    public static void main(String[] args) {
        boolean result = ifPalidrome("kajak");
        System.out.println(ifPalidrome("kajak"));
        System.out.println(ifPalidrome("kamilslimak"));
        System.out.println(ifPalidrome("Dom"));
        System.out.println(ifPalidrome("potop"));
        System.out.println(ifPalidrome("xd"));
    }

    private static boolean ifPalidrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString().equals(input);
//        return sb.reverse().compareTo(new StringBuilder(input) = 0 ? true: false);
    }
}
