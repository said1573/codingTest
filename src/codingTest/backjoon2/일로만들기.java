package codingTest.backjoon2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 일로만들기 {

    private static Queue<Integer> queue = new LinkedList<>();
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        일로만들기 java = new 일로만들기();
        System.out.println(java.solution(n));
    }

    public int solution(int n) {
        queue.offer(n);
        if (n == 1) {
            return 0;
        }

        bfs(n);
        return answer;
    }

    public void bfs(int n) {

        int[] visited = new int[n + 1];
        while (!queue.isEmpty()) {

            int size = queue.size();
            answer++;

            for (int i = 0; i < size; i++) {
                int number = queue.poll();

                System.out.println("number : " + number);

                if (number % 3 == 0) {
                    if (visited[number / 3] == 0) {
                        queue.offer(number / 3);
                        visited[number / 3] = 1;
                    }
                }

                if (number % 2 == 0) {
                    if (visited[number / 2] == 0) {
                        queue.offer(number / 2);
                        visited[number / 2] = 1;
                    }
                }

                if (visited[number - 1] == 0) {
                    queue.offer(number - 1);
                    visited[number - 1] = 1;
                }
            }

            if (queue.contains(1)) {
                break;
            }

        }

        System.out.println(Arrays.toString(visited));
    }
}
