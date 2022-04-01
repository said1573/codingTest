package codingTest.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            array1[i] = scanner.nextInt();
        }

        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            array2[i] = scanner.nextInt();
        }

        Main main = new Main();
        main.solution(array1, array2);

    }

    public int solution(int[] array1, int[] array2) {
        int result = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array2[i]; i++) {
            for (int j = 0; j < array1[j]; j++) {
                if (array1[i] == array2[j]) {
                    sb.append(1).append(" ");
                    break;
                }
            }

        }


        return result;
    }
}
