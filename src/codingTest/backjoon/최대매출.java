package codingTest.backjoon;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int length = Integer.parseInt(input1[0]);
        int count  = Integer.parseInt(input1[1]);

        String[] input2 = scanner.nextLine().split(" ");
        int[] array = new int[length];
        for (int i = 0; i < input2.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        최대매출 java = new 최대매출();
        System.out.println(java.solution(count, array));

    }

    public int solution(int count, int[] array) {
        int result = 0;
        int sum = 0;

        // 초기 sum 지정
        for (int i = 0; i < count; i++) {
            sum += array[i];
            result = sum;
        }

        // sliding window
        for (int i = count; i < array.length; i++) {
            sum += array[i];
            sum -= array[i - count];
            result = Math.max(result, sum);
        }

        return result;
    }
}
