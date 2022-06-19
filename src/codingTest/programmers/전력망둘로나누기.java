package codingTest.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전력망둘로나누기 {

    private static int[][] board;
    private static int[] visited;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {

        int n = 9;
        int[][] wires = new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

//        int n = 4;
//        int[][] wires = new int[][]{{1, 2}, {2, 3}, {3, 4}};

//        int n = 7;
//        int[][] wires = new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};

        전력망둘로나누기 java = new 전력망둘로나누기();
        System.out.println(java.solution(n, wires));
    }


    public int solution(int n, int[][] wires) {

        // board setting
        board = new int[n + 1][n + 1];
        for (int i = 0; i < wires.length; i++) {
            board[wires[i][0]][wires[i][1]] = 1;
            board[wires[i][1]][wires[i][0]] = 1;
        }

        // System.out.println(Arrays.deepToString(board));

        for (int i = 0; i < wires.length; i++) {

            int x = wires[i][0];
            int y = wires[i][1];

            visited = new int[n + 1];
            visited[0] = -1; // 사용하지 않는 인덱스
            visited[1] = 1;  // 1번 노드 방문처리
            System.out.println(Arrays.deepToString(board));
            System.out.println("i  : " + i);
            board[x][y] = 0;
            board[y][x] = 0;

            dfs(1, n);
            board[x][y] = 1;
            board[y][x] = 1;
        }

        return answer;
    }

    public void dfs(int node, int n) {
        if (node == visited.length - 1) {
            int zeroCount = (int) Arrays.stream(visited).filter(o -> o == 0).count();
            int oneCount = (int) Arrays.stream(visited).filter(o -> o == 1).count();
            System.out.println("zeroCount : " + zeroCount);
            System.out.println("oneCount  : " + oneCount);
            System.out.println("res_visited   : " + Arrays.toString(visited));
            System.out.println();
            answer = Math.min(answer, Math.abs(zeroCount - oneCount));

            return;
        } else {

            for (int i = 1; i <= n; i++) {
                if (board[node][i] == 1 && visited[i] == 0) {
                    System.out.println("visited   : " + Arrays.toString(visited));
                    visited[i] = 1;
                    dfs(i, n);
                }
            }
        }



    }

}
