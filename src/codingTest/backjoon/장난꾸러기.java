package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] input1 = scanner.nextLine().split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < input1.length; i++) {
            arr[i] = Integer.parseInt(input1[i]);
        }

        int[] array = arr.clone();
        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != arr[i]) {
                sb.append(i + 1).append(" ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}
