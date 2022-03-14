package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름선수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        int[][] array = new int[length][2];

        for (int i = 0; i < length; i++) {
            String[] input = scanner.nextLine().split(" ");

            int[] temp = new int[2];
            temp[0] = Integer.parseInt(input[0]);
            temp[1] = Integer.parseInt(input[1]);

            array[i] = temp;
        }

        씨름선수 java = new 씨름선수();
        System.out.println(java.solution(array));

    }

    public int solution(int[][] array) {

        int failCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if ((array[i][0] < array[j][0] && array[i][1] < array[j][1]) ||
                        (array[i][0] > array[j][0] && array[i][1] > array[j][1])) {

                    System.out.println(Arrays.toString(array[i]));
                    System.out.println(Arrays.toString(array[j]));
                    System.out.println();
                    failCount += 1;
                    break;
                }
            }
        }

        return array.length - failCount;
    }
}
