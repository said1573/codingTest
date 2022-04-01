package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 좌표정렬 {
    public static void main(String[] args) {

        좌표정렬 java = new 좌표정렬();
        java.solution();

    }

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        List<Point> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            list.add(new Point(n1, n2));
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }
    }

    public class Point implements Comparable<Point> {

        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }

}
