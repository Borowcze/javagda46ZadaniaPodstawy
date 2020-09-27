package SDA.javagda.basic.day1;

public class Exe10 {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(444));
    }

    private static int sumOfDigits(int number) {
        int restOfDivision = number % 10;
        int restOfDivision2 = (number / 10) % 10;
        int restOfDivision3 = ((number/10)-restOfDivision2)/10 ;
        int sum = restOfDivision+restOfDivision2+restOfDivision3;
        return sum;
    }
}
