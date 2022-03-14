package codingTest.backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 임시반정정하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            String[] input1 = scanner.nextLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(input1[j]);
            }
        }

        임시반정정하기 java = new 임시반정정하기();
        System.out.println(java.solution(length, array));
    }

    public int solution(int length, int[][] array) {

        int answer = 0;
        int min = 0;

        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                for (int z = 0; z < array.length; z++) {
                    if (array[i][z] == array[j][z]) {
                        count++;
                        break;
                    }
                }
            }
            if (min < count) {
                min = count;
                answer = i;
            }
        }

        return answer + 1;
    }
}
