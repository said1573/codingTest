package codingTest.backjoon2;

import java.util.*;

public class 영역구하기 {


    private static List<Integer> list = new ArrayList<>();
    private static boolean[][] board;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int answer = 0;
    private static int count = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board = new boolean[x][y];

        int count = scanner.nextInt();
        int[][] array = new int[count][4];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
            array[i][2] = scanner.nextInt();
            array[i][3] = scanner.nextInt();
        }

        영역구하기 java = new 영역구하기();
        java.solution(x, y, array);
    }

    public void solution(int x, int y, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int startX = array[i][1];
            int startY = array[i][0];

            int endX = array[i][3] - 1;
            int endY = array[i][2] - 1;

            blockSettint(startX, startY, endX, endY);
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!board[i][j]) {
                    board[i][j] = true;
                    answer++;
                    count++;
                    bfs(new int[]{i, j}, x, y);
                    list.add(count);
                    count = 0;
                }
            }
        }

        Collections.sort(list);

        System.out.println(answer);
        StringBuilder sb = new StringBuilder();
        for (int size : list) {
            sb.append(size).append(" ");
        }

        System.out.println(sb.toString().trim());

    }

    public void bfs(int[] arr, int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(arr);

        while (!queue.isEmpty()) {
            int[] input = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = input[0] + dx[i];
                int nextY = input[1] + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < row && nextY < col && !board[nextX][nextY]) {
                    board[nextX][nextY] = true;
                    count++;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
    }

    public void blockSettint(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (!board[i][j]) {
                    board[i][j] = true;
                }
            }
        }
    }

}
