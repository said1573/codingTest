package codingTest.test;

import java.util.Arrays;

public class 수열구하기 {

    private static int[] target;
    private static int[] soruce = new int[]{1, 2, 3};
    private static boolean[] visited;
    private static int n;
    private static int m;

    public static void main(String[] args) {
        /* 출력
        [1, 2]
        [1, 3]
        [2, 1]
        [2, 3]
        [3, 1]
        [3, 2] */

        // [1, 2, 3] 에서 m개 구하기
        n = 3;
        m = 2;

        System.out.println(Arrays.toString(soruce));
        visited = new boolean[n];
        target = new int[m];

        수열구하기 java = new 수열구하기();
        java.dfs(0);
    }

    public void dfs(int level) {
        if (level == target.length) {
            System.out.println(Arrays.toString(target));
        } else {
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    target[level] = soruce[i];
                    dfs(level + 1);
                    visited[i] = false;
                }

            }
        }
    }
}
