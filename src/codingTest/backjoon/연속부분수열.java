package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 연속부분수열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");

        int length = Integer.parseInt(input1[0]);
        int maxValue = Integer.parseInt(input1[1]);

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int answer = 0;
        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            int sum = 0;
            for (int j = startIndex; j < array.length; j++) {

                if (sum + array[j] > maxValue) {
                    break;
                } else {
                    sum += array[j];
                    if (sum == maxValue) {
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);

    }


}
