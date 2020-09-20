package SDA.javagda.basic.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe2 {
    private final static float pi = 3.14f;

    public static void main(String[] args) {

        Exe2 exe2 = new Exe2();
        float diam = exe2.getDiameterFromUser();
        System.out.println("Srednica to: "+ diam);
        System.out.println("Pole koła to: "+ exe2.calculateField(diam));
        float field = exe2.calculateCircut(diam);
        System.out.println("Obwód koła to: "+ field);

    }
    // Scanner
    private static float getDiameterFromUser() {
        System.out.println("Podaj średnicę koła");
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex){
            System.out.println("Wrong input");
            System.exit(1);
        }
        return 0;
    }

//     obwod - 2PIr
    private float calculateCircut(float diameter) {

        float circut = 2*pi*(diameter/2);
        return circut;
    }

    //  pole - PIr^2
    private static float calculateField(float diameter) {
        float radius = diameter/2;
        return (float) (pi*Math.pow(radius,2));
    }
}
