package codingTest.backjoon2;

import java.util.Scanner;

public class 조합의경우의수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(DFS(n, m));

    }

    public static int DFS(int n, int m) {
        if (n == m || m == 0) {
            return 1;
        } else {
            return DFS(n - 1, m - 1) + DFS(n - 1, m);
        }
    }
}
