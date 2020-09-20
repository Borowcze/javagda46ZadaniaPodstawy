package SDA.javagda.basic.day1;

public class Exe9 {
    public static void main(String[] args) {
        numberGenerator(1,35);
    }

    public static void numberGenerator(int x, int y){
        for(int i = x;i<y;i++){
            if(i%(15)==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
