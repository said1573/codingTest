package codingTest.backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {

    private static boolean[] visited = new boolean[10001];
    private static int[] check = new int[]{-1, 1, 5};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");

        int start = Integer.parseInt(input1[0]);
        int point = Integer.parseInt(input1[1]);

        송아지찾기 java = new 송아지찾기();
        System.out.println(java.solution(start, point));

    }

    public int solution(int s, int e) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        int level = 1;
        while (!queue.isEmpty()) {

            for (int j = 0; j < queue.size(); j++) {
                System.out.println("queue.size : " + queue.size());
                System.out.println("j : " + j + ", queue : " + queue);
                int data = queue.poll();
                visited[data] = true;
                if (data == e) {
                    return level;
                }
                for (int i = 0; i < check.length; i++) {
                    int sum = data + check[i];
                    System.out.println("sum : " + sum);


                    if (visited[sum] == false) {
                        visited[sum] = true;
                        queue.offer(data + check[i]);
                    }

                }

            }
            System.out.println();
            level++;

        }

        return level;
    }
}
