package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int length = Integer.parseInt(input1[0]);
        int max = Integer.parseInt(input1[1]);

        String[] input2 = scanner.nextLine().split(" ");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        뮤직비디오 java = new 뮤직비디오();
        java.solution(max, array);
    }

    public int solution(int count, int[] array) {
        int result = 0;

        int max = Arrays.stream(array).sum();
        int min = Arrays.stream(array).min().getAsInt();

        while (min <= max) {
            int mid = (max + min) / 2;
            if (check(mid, array) <= count) {
                result = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(result);
        return result;
    }

    public int check(int mid, int[] array) {
        int cnt = 1;
        int sum = 0;

        for (int x : array) {
            if (sum + x > mid) {
                cnt += 1;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }
}
