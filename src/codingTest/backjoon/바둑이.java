package codingTest.backjoon;

import java.util.Scanner;

public class 바둑이 {

    private static int max;
    private static int length;
    private static int answer = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        max = Integer.parseInt(input1[0]);
        length = Integer.parseInt(input1[1]);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        바둑이 java = new 바둑이();
        System.out.println(java.solution(array, max));
    }

    public int solution(int[] array, int max) {
        DFS(0, 0, array);
        return answer;
    }

    public void DFS(int index, int sum, int[] array) {
        if (sum > max) {
            return;
        }
        if (index == length) {
            answer = Math.max(sum, answer);
            return;
        } else {
            DFS(index + 1, sum + array[index], array);
            DFS(index + 1, sum, array);
        }
    }
}
