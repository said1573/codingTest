package codingTest.backjoon2;

import java.util.*;

public class 최대수입스케줄 {

    private static Queue<Integer> queue = new PriorityQueue<>();
    private static int answer = 0;
    private static int max = 0;

    public static void main(String[] args) {

        최대수입스케줄 java = new 최대수입스케줄();
        java.solution();

    }

    public int solution() {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        List<Leacture> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int money = scanner.nextInt();
            int day = scanner.nextInt();

            if (max < day) {
                max = day;
            }

            list.add(new Leacture(money, day));
        }

        Collections.sort(list);

        int j = 0;
//        for (int i = max; i >= 1; i--) {
//            for (; j < size; j++) {
//                if (list.get()) {
//
//                }
//            }
//        }
        System.out.println(list);

        return answer;
    }
}

class Leacture implements Comparable<Leacture> {
    int money;
    int day;

    public Leacture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Leacture leacture) {
        return leacture.day - this.day;
    }
}