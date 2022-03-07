package codingTest.backjoon;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int answer = 0;
        int start  = 1;

        while(start <= (num / 2) + 1) {

            int sum = 0;

            for (int i = start; i < num; i++) {
                sum += i;
                if (sum == num) {
                    answer += 1;
                    break;
                } else if (sum > num) {
                    break;
                }
            }

            start++;

        }

        System.out.println(answer);
    }
}
