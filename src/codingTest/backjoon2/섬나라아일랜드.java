package codingTest.backjoon2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라아일랜드 {
    private static Queue<Position> queue = new LinkedList<>();
    private static int[][] board;
    private static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    private static int[] dy = {0, 0, -1, 1, 1, -1, -1, 1};
    private static int answer = 0;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        board = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        섬나라아일랜드 java = new 섬나라아일랜드();
        System.out.println(java.solution());

    }

    public int solution() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    queue.offer(new Position(i, j));
                    board[i][j] = 0;
                    BFS();
                }
            }
        }
        return answer;
    }

    public void BFS() {
        while(!queue.isEmpty()) {
            Position position = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nextX = dx[i] + position.x;
                int nextY = dy[i] + position.y;

                if (nextX >= 0 && nextY >= 0 && nextX < board.length && nextY < board.length && board[nextX][nextY] == 1) {
                    board[nextX][nextY] = 0;
                    queue.offer(new Position(nextX, nextY));
                }
            }
        }
    }

    class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

