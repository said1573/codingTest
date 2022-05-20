package codingTest.programmers;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class 입국심사 {

    private static long answer = 0;

    public static void main(String[] args) {

        int n = 6;
        int[] times = {7, 10};

        입국심사 java = new 입국심사();
        java.solution(n, times);

    }

    public long solution(int n, int[] times) {


        Arrays.sort(times);

        long min = 0;
        long max = 1000000000;

        while(min <= max) {
            long mid = (min + max) / 2;

//
//            AtomicLong sum = new AtomicLong();
//            Arrays.stream(times).forEach(o -> {
//                sum.addAndGet(mid / o);
//            });
//
//            }

        }
        return answer;
    }
}
