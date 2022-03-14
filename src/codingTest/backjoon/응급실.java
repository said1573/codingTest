package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 응급실 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        int length = Integer.parseInt(input1[0]);


        int[] array = new int[length];
        String[] input2 = scanner.nextLine().split(" ");
        int checkValue = Integer.parseInt(input2[Integer.parseInt(input1[1])]);
        // 형 변환
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int answer = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkValue) {
                System.out.println(answer);
                break;
            }

            answer += 1;
        }


    }
}
