package SDA.javagda.basic.day1;



public class Exe5 {
    public static void main(String[]args) {
        int sum = sumDigits(4, 11);
        System.out.println("Sum: "+ sum);
        int sumW = sumDigitsWhile(4, 11);
        System.out.println("Sum while: "+ sumW);

    }

    private static int sumDigits (int min, int max){
        int result = 0;
        for(int i = min; i <=max; i++){
            result +=i;
        }
        return result;
    }

    private static int sumDigitsWhile (int min, int max){
        int result = 0;
        int counter=min;

        while(counter <= max){
            result += counter;
            counter++;
        }
        return result;
    }


}
