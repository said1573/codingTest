package codingTest.backjoon;

import java.util.Scanner;

public class 동전교환 {

    private static int answer = Integer.MAX_VALUE;
    private static int maxSum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] input1 = scanner.nextLine().split(" ");
        maxSum = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < input1.length; i++) {
            array[i] = Integer.parseInt(input1[i]);
        }

        동전교환 java = new 동전교환();
        System.out.println(java.solution(array));
    }

    public int solution(int array[]) {
        DFS(0, 0, array);
        return answer;
    }

    public void DFS(int count, int sum, int[] array) {
        if (sum > maxSum) {
            return;
        }
        if (sum == maxSum) {
            answer = Math.min(answer, count);
            return;
        } else {
            for (int i = 0; i < array.length; i++) {
                DFS(count + 1, sum + array[i], array);
            }
        }
    }
}
