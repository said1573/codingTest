package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}
