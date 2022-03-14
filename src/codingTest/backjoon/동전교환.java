package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환 {

    private static int answer = 0;
    private static int maxNum;
    private static int length;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        scanner.nextLine();

        String[] input1 = scanner.nextLine().split(" ");
        maxNum = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < input1.length; i++) {
            array[i] = Integer.parseInt(input1[i]);
        }

        동전교환 java = new 동전교환();
        System.out.println(java.solution(array));
    }

    public int solution(int array[]) {
        int result = 0;
        return result;
    }

    public void DFS(int count, int sum, int[] array) {
        if (sum == maxNum) {
            answer = count;
            return;
        } else {
            DFS(count + 1, sum + array[count], array);
            DFS(count + 1, sum, array);
        }
    }
}
