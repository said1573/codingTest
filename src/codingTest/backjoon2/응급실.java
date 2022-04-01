package codingTest.backjoon2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int index = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        응급실 java = new 응급실();
        System.out.println(java.solution(array, index));
    }

    public int solution(int[] array, int index) {
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.offer(new Person(i, array[i]));
        }

        boolean flag = true;
        while(flag) {
            Person poll = queue.poll();

            for (Person person : queue) {
                if (poll.priority < person.priority) {
                    queue.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (poll != null) {
                answer += 1;
                if (poll.index == index) {
                    break;
                }
            }


        }

        return answer;
    }

    class Person {
        int index;
        int priority;

        public Person(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

    }
}
