package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;

public class 미로탐색 {

    private static int answer = 0;
    private static int[] xPosition = new int[]{1, 0, -1, 0};
    private static int[] yPosition = new int[]{0, 1, 0, -1};
    private static int[][] array = new int[8][8];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        미로탐색 java = new 미로탐색();
        System.out.println(java.solution());
    }

    public int solution() {
        array[1][1] = 1;
        DFS(1, 1);
        return answer;
    }

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
            return;
        } else {
            for (int i = 0; i < 4; i++) {

                int nx = x + xPosition[i];
                int ny = y + yPosition[i];

                if (nx <= 7 && nx >= 1 && ny >= 1 && ny <= 7 && array[nx][ny] == 0) {
                    array[nx][ny] = 1;
                    DFS(nx, ny);
                    array[nx][ny] = 0;
                }
            }
        }
    }


}
