package codingTest.backjoon2;

import java.util.Scanner;

public class 최대점수구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int time = scanner.nextInt();

        int[][] array = new int[count][2];
        for (int i = 0; i < count; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        최대점수구하기 java = new 최대점수구하기();
        System.out.println(java.solution(count, time, array));
    }

    public int solution(int count, int maxTime, int[][] array) {
        int result = 0;

        int[] timeArray = new int[maxTime + 1];
        for (int i = 0; i < array.length; i++) {
            int score = array[i][0];
            int time  = array[i][1];

            for (int j = maxTime; j >= time; j--) {
                timeArray[j] = Math.max(timeArray[j], timeArray[j - time] + score);
            }
        }

        return timeArray[maxTime];
    }
}
