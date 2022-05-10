package codingTest.backjoon2;

import java.util.*;

public class 친구인가 {

    private static int[] array;

    public static void main(String[] args) {

        친구인가 java = new 친구인가();
        java.solution();

    }

    public void solution() {

        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int size = scanner.nextInt();

        array = new int[studentCount + 1];

        for (int i = 0 ; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 1; i <= size; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            union(a, b);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int fa = find(a);
        int fb = find(b);
        if (fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            array[fa] = fb;
        }
    }

    public int find(int num) {
        if (num == array[num]) {
            return num;
        } else {
            return array[num] = find(array[num]);
        }
    }
}
