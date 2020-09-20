package SDA.javagda.basic.day1;

public class ExeDodatkowe {
    public static void main(String[] args) {

        for(int i=1;i<11;i++){
            for(int j =1; j<11;j++){
                int value = i*j;
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }
}