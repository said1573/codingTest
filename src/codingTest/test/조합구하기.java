package codingTest.test;

import java.util.Arrays;

public class 조합구하기 {

    private static int[] target;
    private static int[] soruce = new int[]{1, 2, 3};
    private static int n;
    private static int m;

    public static void main(String[] args) {
        /*
        [1, 2]
        [1, 3]
        [2, 3] */

        n = 3;
        m = 2;

        System.out.println(Arrays.toString(soruce));
        target = new int[m];

        조합구하기 java = new 조합구하기();
        java.dfs(0, 0);
    }

    public void dfs(int level, int startIndex) {
        if (level == target.length) {
            System.out.println(Arrays.toString(target));
        } else {
            for (int i = startIndex; i < n; i++) {
                target[level] = soruce[i];
                dfs(level + 1, i + 1);
            }
        }
    }
}
