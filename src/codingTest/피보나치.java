package codingTest;

import java.util.Scanner;

public class 피보나치 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] answer = new int[count];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int j : answer) {
            sb.append(j).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
