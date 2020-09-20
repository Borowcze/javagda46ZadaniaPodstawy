package SDA.javagda.basic.day2;

import java.util.Arrays;

public class Exe13 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [] arrayTable = {-12,5,14,8,2};
        System.out.println("Max is: "+ getMaxValue(arrayTable));
        System.out.println("Min is: "+ getMinValue(arrayTable));
        int sum = getSum(arrayTable);
        System.out.println("Sum is: "+ sum);
    }

    private static int getMaxValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
//        return Arrays.stream(array).min().getAsInt();
    }
    private static int getMinValue(int[] array) {
        for (int singleArray : array) {
            if (singleArray < min) {
                min = singleArray;
            }
        }
        return min;
    }
    private static int getSum(int[] array){
        return Arrays.stream(array).sum();
    }
}
