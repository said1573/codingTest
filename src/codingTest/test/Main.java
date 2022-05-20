package codingTest.test;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Main main = new Main();
        for (int i = 0; i < size; i++) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            System.out.println(main.solution(n, m));
        }
    }

    public long solution(long r, long n) {

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}