package codingTest.backjoon2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 결혼식 {

    private static int[][] array;
    private static List<int[]> list = new ArrayList<>();

    private static int answer = 0;
    private static int min = Integer.MAX_VALUE;
    private static int max = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        array = new int[size][2];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
                if (max < array[i][j]) {
                    max = array[i][j];
                }

                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }

        결혼식 java = new 결혼식();
        System.out.println(java.solution());
    }

    public int solution() {
        for (int i = min; i < max; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if ( i >= array[j][0] && i < array[j][1]) {
                    sum++;
                }
            }
            answer = Math.max(sum, answer);
        }

        return answer;
    }
}
