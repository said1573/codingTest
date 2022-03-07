package codingTest.backjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");

        // String -> int 타입 변경
        Integer[] array = new Integer[input.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int[] anwer = new int[count];
        for (int i = 0; i < count; i++) {
            int cnt = 1;
            for (int j = 0; j < count; j++) {
                if (array[j] > array[i]) {
                    cnt += 1;
                }
                anwer[i] = cnt;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int a : anwer) {
            sb.append(a).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}
