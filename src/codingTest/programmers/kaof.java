package codingTest.programmers;

import javax.swing.text.Position;
import java.util.*;

public class kaof {

    private static Queue<Position> queue = new LinkedList<>();

    private static int[][] board;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int count = 0;
    private static int max = 0;

    public static void main(String[] args) {
        kaof java = new kaof();
        System.out.println(java.solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}}));;

    }

    public int[] solution(int m, int n, int[][] picture) {

        board = picture.clone();

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (board[i][j] != 0) {
                    int number = board[i][j];
                    board[i][j] = 0;
                    count++;
                    queue.offer(new Position(i, j));
                    BFS(m, n, number);
                }
            }
        }
        
        System.out.println(queue);
        return new int[]{count, max};
    }

    public void BFS(int m, int n, int number) {
        System.out.println("m : " + m);
        System.out.println("n : " + n);
        System.out.println("number : " + number);

        int typeCount = 1;

        while (!queue.isEmpty()) {

            Position position = queue.poll();

            for (int i = 0; i < 4; i++) {

                int nextX = position.x + dx[i];
                int nextY = position.y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < m && nextY < n) {
                    if (board[nextX][nextY] == number) {
                        board[nextX][nextY] = 0;
                        typeCount++;
                        queue.offer(new Position(nextX, nextY));
                    }
                }
                System.out.println(Arrays.deepToString(board));
            }
        }

        if (max < typeCount) {
            max = typeCount;
        }
    }

    class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

