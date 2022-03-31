package codingTest.backjoon;

import java.util.Scanner;

public class 돌다리건너기 {

    public static int[] array;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        array = new int[length + 1];

        array[0] = 1;
        array[1] = 2;

        for (int i = 2; i <= length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        System.out.println(array[length]);

    }
}
