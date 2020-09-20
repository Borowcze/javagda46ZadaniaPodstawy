package SDA.javagda.basic.day2;

import java.util.Arrays;

public class Exe3MultiArrays {
    public static void main(String[] args) {

        int[][] arrayTable = new int[3][10];

        for(int i = 0; i < 10; i++){
            arrayTable[0][i]= i+1;
            arrayTable[1][i]= arrayTable[0][i] * arrayTable[0][i];
            arrayTable[2][i]= arrayTable[0][i] * arrayTable[1][i];

        }
        for(int[] a : arrayTable)
            System.out.println(Arrays.toString(a));
    }
}