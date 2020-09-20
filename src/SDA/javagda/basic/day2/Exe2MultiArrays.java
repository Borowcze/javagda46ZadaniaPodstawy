package SDA.javagda.basic.day2;

import java.lang.reflect.Array;

public class Exe2MultiArrays {
    public static void main(String[] args) {

        int[][] arrays = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int sum = arrays[0][0]+arrays[1][1]+arrays[2][2]+arrays[0][2]+arrays[1][1]+arrays[2][0];
        int sum2 = arrays[0][0]+arrays[1][0]+arrays[2][0]; //itp
    }
}
