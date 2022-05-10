package codingTest.test;

import java.util.*;

class Main {

    private static long[] array;
    private static long answer = 0;
    private static long need;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        need = scanner.nextInt();

        array = new long[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Main main = new Main();
        System.out.println(main.solution());

    }

    public long solution() {

        Arrays.sort(array);

        long min = 0;
        long max = array[array.length - 1];

        while (min <= max) {

            long mid = (min + max) / 2;
            long result = check(mid);

            if (result >= need) {
                answer = Math.max(answer, mid);
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }

    public long check(long value) {

        long result = 0;

        for (int i = 0; i < array.length; i++) {
            long num = array[i] - value;

            if (num > 0) {
                result += num;
            }
        }

        return result;
    }

}