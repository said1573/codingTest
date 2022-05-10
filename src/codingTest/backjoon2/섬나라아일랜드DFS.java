package codingTest.backjoon2;

import java.util.*;

public class 섬나라아일랜드DFS {

    private static int[][] board;

    private static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    private static int[] dy = {0, 0, -1, 1, 1, -1, -1, 1};

    private static int answer = 0;

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long a = Arrays.stream(dx).filter(o -> o == 1).count();
        System.out.println(a);
        board = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        섬나라아일랜드DFS java = new 섬나라아일랜드DFS();
        System.out.println(java.solution());

    }

    public int solution() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j);
                }
            }
        }

        return answer;
    }

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < board.length && nextY < board.length && board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
