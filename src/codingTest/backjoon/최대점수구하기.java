package codingTest.backjoon;

import java.util.Scanner;

public class 최대점수구하기 {

    private static int[] scoreArray;
    private static int[] timeArray;
    private static int limitTime;
    private static int maxScore;
    private static int count;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        count = Integer.parseInt(input1[0]);
        limitTime = Integer.parseInt(input1[1]);

        scoreArray = new int[count];
        timeArray  = new int[count];

        for (int i = 0; i < count; i++) {
            String[] input2 = scanner.nextLine().split(" ");
            scoreArray[i]   = Integer.parseInt(input2[0]);
            timeArray[i]    = Integer.parseInt(input2[1]);
        }

        최대점수구하기 java = new 최대점수구하기();
        System.out.println(java.solution());
    }

    public int solution() {
        DFS(0, 0, 0);
        return maxScore;
    }

    public void DFS(int index, int scoreSum, int timeSum) {
        if (limitTime < timeSum) {
            return;
        }
        if (index == count) {
            maxScore = Math.max(maxScore, scoreSum);
            return;
        } else {
            DFS(index + 1, scoreArray[index] + scoreSum, timeArray[index] + timeSum);
            DFS(index + 1, scoreSum, timeSum);
        }
    }
}
