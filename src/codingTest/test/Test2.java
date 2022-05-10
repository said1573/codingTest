package codingTest.test;

import java.util.*;

public class Test2 {

    private static int[][] board;
    private static int[] visited;
    private static int[] array;
    private static int answer = 0;

    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}};
        Test2 java = new Test2();
        java.solution(6, array, 4);

    }

    public long solution(int N, int[][] road, int K) {

        board = new int[N + 1][N + 1];

        array = new int[N + 1];
        visited = new int[N + 1];

        visited[0] = -1;

        for (int i = 0; i < road.length; i++) {
            int x = road[i][0];
            int y = road[i][1];
            int value = road[i][2];

            if (board[x][y] > 0) {
                board[x][y] = Math.min(value, board[x][y]);
            } else {
                board[x][y] = value;
            }

            if (board[y][x] > 0) {
                board[y][x] = Math.min(value, board[y][x]);
            } else {
                board[y][x] = value;
            }
        }

        System.out.println(Arrays.deepToString(board));
        visited[1] = 1;
        array[1] = 1;
        DFS(1, N, K, 0, road);

        System.out.println(Arrays.toString(visited));

        // 방문할 수 있는 노드 확인
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                answer++;
            }
        }

        System.out.println("answer : " + answer);
        return answer;
    }


    public void DFS(int node, int N, int K, int valueSum, int[][] road) {
        if (valueSum > K) {
            System.out.println("visited222 : " + Arrays.toString(visited));
            return;
        }

        if (node == N) {
            System.out.println("visited : " + Arrays.toString(visited));
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (board[node][i] > 0 && visited[i] == 0) {
                    System.out.println("node : " + node);
                    System.out.println("i : " + i);
                    System.out.println("valueSum : " + valueSum);
                    System.out.println("board[node][i]) : " + board[node][i]);

                    if (valueSum + board[node][i] <= K) {
                        visited[i] = 1;
                        array[i] = 1;
                        System.out.println(Arrays.toString(array));
                        System.out.println();
                        DFS(i, N, K, valueSum + board[node][i], road);
                        visited[i] = 0;
                    }

                }
            }
        }
    }
}
