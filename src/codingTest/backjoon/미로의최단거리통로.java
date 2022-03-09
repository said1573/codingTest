package codingTest.backjoon;

import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의최단거리통로 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] board;
    private static int[][] dis;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 1; j <= 7; j++) {
                board[i][j] = Integer.parseInt(input[j - 1]);
            }
        }

        미로의최단거리통로 java = new 미로의최단거리통로();
        java.solution();

    }

    public void solution() {
        BFS(1, 1);

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(x, y));
        board[x][y] = 1;

        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }

    }

    public class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
