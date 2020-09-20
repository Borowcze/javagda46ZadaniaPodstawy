package SDA.javagda.basic.day2;

public class Exe14 {
    public static void main(String[] args) {
        int[] arrayTable = {12, -7, 19, -5};
        int length = isBiggerThanZero(arrayTable);
        int[] newNegativeDigits = createArrayWithNegativeDigits(length,arrayTable);
        System.out.println(length);
        System.out.println(newNegativeDigits[0]);
        System.out.println(newNegativeDigits[1]);

    }

    private static int isBiggerThanZero(int[] arrays) {
        int counter = 0;
        for (int i : arrays) {
            if (i < 0) {
                counter++;
            }
        }
        return counter;
    }
    private static int[] createArrayWithNegativeDigits(int length, int[] arrays) {
        int[] newArray = new int[length];
        for(int i = 0, counter = 0; i < arrays.length; i++){
            if(arrays[i] < 0){
                newArray[counter]= arrays[i];
                counter++;
            }
        }
        return newArray;
    }
}
