package codingTest.backjoon;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        int answer = 0;

        int[] array = new int[range + 1];

        for (int i = 2; i <= range; i++) {
            if (array[i] == 0) {
                answer += 1;
                for (int j = i; j < array.length; j = j + i) {
                    array[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }

}
