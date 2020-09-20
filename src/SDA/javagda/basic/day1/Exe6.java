package SDA.javagda.basic.day1;

public class Exe6 {
    public static void main(String[] args) {

        multiplicationTable(10,1,7);

    }

    private static void multiplicationTable(int multiplier, int multipliedMin, int multipliedMax) {

        for(int i = multipliedMin;i<=multipliedMax;i++){
            System.out.println(multiplier+"x"+i+"="+multiplier*i);
        }
}
}
