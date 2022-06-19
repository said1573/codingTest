package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        계단오르기 java = new 계단오르기();
        System.out.println(java.solution(size));
    }

    public int solution(int size) {
        int[] array = new int[size + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(Arrays.toString(array));
        return array[size];
    }
}
