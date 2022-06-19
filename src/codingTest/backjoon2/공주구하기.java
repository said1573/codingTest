package codingTest.backjoon2;

import java.util.*;

public class 공주구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int tempo = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= people; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (queue.size() > 1) {
            count++;
            int poll = queue.poll();
            if (count == tempo) {
                count = 0;
            } else {
                queue.offer(poll);
            }
        }

        System.out.println(queue.peek());

    }
}
