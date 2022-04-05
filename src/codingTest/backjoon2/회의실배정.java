package codingTest.backjoon2;

import java.util.*;

public class 회의실배정 {

    private static int answer = 0;
    private static List<Time> list = new ArrayList<>();

    public static void main(String[] args) {

        회의실배정 java = new 회의실배정();
        System.out.println(java.solution());

    }

    public int solution() {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new Time(start, end));
        }

        Collections.sort(list);

        int end   = list.get(0).end;
        answer++;
        for (int i = 1; i < list.size(); i++) {
            Time time = list.get(i);
            if (end <= time.start) {
                answer++;
                end = time.end;
            }
        }

        return answer;
    }

    public class Time implements Comparable<Time> {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }
}
