package codingTest.test;

import java.util.Arrays;

public class 피보나치 {
    public static void main(String[] args) {

        int[] array = new int[45];

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println(array[9]);
    }
}
