package codingTest.backjoon2;

import java.util.*;

public class 동전교환 {

    static int n;
    static int m;
    static int[] dy;
    static int[] coinArr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        coinArr = new int[n];

        for (int i = 0; i < n; i++) {
            coinArr[i] = sc.nextInt();
        }

        m = sc.nextInt();
        dy = new int[m + 1];
        for (int i = 1; i < dy.length; i++) {
            dy[i] = Integer.MAX_VALUE;
        }

        System.out.println(knapsack());
    }

    static int knapsack() {
        for (int coin : coinArr) {
            for (int j = coin; j <= m; j++) {
                int tmp = dy[j - coin] + 1;
                if (dy[j] > tmp) dy[j] = tmp;
            }
        }
        return dy[m];
    }

}
