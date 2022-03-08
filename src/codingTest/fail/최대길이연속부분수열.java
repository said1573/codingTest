package codingTest.fail;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int length = Integer.parseInt(input1[0]);
        int count  = Integer.parseInt(input1[1]);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

    }
}
