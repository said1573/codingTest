package codingTest.backjoon2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 최대부분증가수열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        int[] board = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        board[0] = 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    board[i] = Math.max(board[i], board[j]);
                }
            }
            board[i] += 1;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(board));
        System.out.println(Arrays.stream(board).max().getAsInt());

    }
}
