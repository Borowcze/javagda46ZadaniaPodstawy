package SDA.javagda.basic.day1;

public class Exe8 {
    public static void main(String[] args) {
        boolean result = isPrimeNumber(16);
        System.out.println("If digit is prime: " + result);

        printPrimeNumbersFromRange(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
    private static void printPrimeNumbersFromRange(int min, int max){
        for (int i = min; i < max; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrimeNumber (int number){
        if(number<2){
            return false;
        }
        for(int i=2; i <= number/2; i++){
            if(number% i ==0){
                return false;
            }
        }
        return true;
    }
}