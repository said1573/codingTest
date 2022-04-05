package codingTest.backjoon2;

import java.util.Queue;
import java.util.Scanner;

public class 섬나라아일랜드 {

    private static int answer = 0;
    private static int[][] array;
    private static int[] dx = {1, 0, -1, 0, 1, -1, 1, -1};
    private static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        섬나라아일랜드 java = new 섬나라아일랜드();
        System.out.println(java.solution(array));
    }

    public int solution(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    array[i][j] = 0;
                    answer++;
                    BFS(i, j, array.length);
                }
            }
        }

        return answer;
    }

    public void BFS(int x, int y, int size) {

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextX < size && nextY >= 0 && nextY < size && array[nextX][nextY] == 1) {
                array[nextX][nextY] = 0;
                BFS(nextX, nextY, size);
            }
        }
    }
}
