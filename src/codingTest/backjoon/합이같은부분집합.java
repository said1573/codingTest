package codingTest.backjoon;

import java.util.Scanner;

public class 합이같은부분집합 {

    private static String answer = "NO";
    private static int n;
    private static int total = 0;
    private static boolean flag = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
            total += array[i];
        }

        DFS(0, 0, array);
        System.out.println(answer);

    }

    public static void DFS(int L, int sum, int[] array) {
        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }

        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + array[L], array);
            DFS(L + 1, sum, array);
        }
    }
}
