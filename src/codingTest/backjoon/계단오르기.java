package codingTest.backjoon;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n + 1];

        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        System.out.println(array[n]);
    }
}
