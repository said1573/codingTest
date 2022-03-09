package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        int length = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);

        String[] input2 = scanner.nextLine().split(" ");
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == m) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
