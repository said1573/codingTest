package codingTest.backjoon2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {

    private static int answer = 0;
    private static int[] ch;
    private static int[] dis = new int[]{-1, 1, 5};
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        int target = scanner.nextInt();

        송아지찾기 java = new 송아지찾기();
        System.out.println(java.solution(position, target));

    }

    public int solution(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int L = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                if (x == e) {
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }

            L++;
        }

        return answer;
    }
}
