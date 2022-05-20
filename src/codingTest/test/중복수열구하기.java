package codingTest.test;

import java.util.Arrays;

public class 중복수열구하기 {

    private static int[] target;
    private static int[] soruce = new int[]{1, 2, 3};
    private static int n;
    private static int m;

    public static void main(String[] args) {
        /*
        [1, 1]
        [1, 2]
        [1, 3]
        [2, 1]
        [2, 2]
        [2, 3]
        [3, 1]
        [3, 2]
        [3, 3] */

        n = 3;
        m = 2;

        System.out.println(Arrays.toString(soruce));
        target = new int[m];

        중복수열구하기 java = new 중복수열구하기();
        java.dfs(0);
    }

    public void dfs(int level) {
        if (level == target.length) {
            System.out.println(Arrays.toString(target));
        } else {
            for (int i = 1; i <= n; i++) {
                target[level] = i;
                dfs(level + 1);
            }
        }
    }
}
