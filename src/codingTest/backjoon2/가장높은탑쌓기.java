package codingTest.backjoon2;

import java.util.Scanner;

public class 가장높은탑쌓기 {

    private static int answer = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] array = new int[size][3];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        가장높은탑쌓기 java = new 가장높은탑쌓기();
        System.out.println(java.solution(array));

    }

    public int solution(int[][] array) {
        DFS(0, 0, 0, array);
        return answer;
    }

    public void DFS(int level, int heightSum, int weigthSum, int[][] array) {
//        if () {
//            return;
//        }
        if (level == array.length) {
            answer = Math.max(heightSum, answer);
            return;
        } else {
            DFS(level + 1, heightSum + array[level][1], weigthSum + array[level][2], array);
            DFS(level + 1, heightSum, weigthSum, array);
        }
    }
}
