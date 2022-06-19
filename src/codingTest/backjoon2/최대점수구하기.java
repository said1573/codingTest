package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;

public class 최대점수구하기 {

    private static int answer = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        int maxTime = scanner.nextInt();

        int[][] array = new int[question][2];
        for (int i = 0; i < question; i++) {
            int socre = scanner.nextInt();
            int time = scanner.nextInt();
            array[i] = new int[]{socre, time};
        }

        System.out.println(Arrays.deepToString(array));
        최대점수구하기 java = new 최대점수구하기();
        System.out.println(java.solution(array, maxTime));
    }

    public int solution(int[][] array, int maxTime) {

        DFS(0, 0, 0, maxTime, array);
        return answer;
    }

    public void DFS(int level, int timeSum, int scoreSum, int maxTime, int[][] array) {
        if (timeSum > maxTime) {
            return;
        }

        if (level == array.length) {
            answer = Math.max(scoreSum, answer);
            return;
        } else {
            DFS(level + 1, timeSum + array[level][1], scoreSum + array[level][0], maxTime, array);
            DFS(level + 1, timeSum, scoreSum, maxTime, array);
        }
    }
}
