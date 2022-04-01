package codingTest.backjoon2;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[][] array = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int l = scanner.nextInt();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = scanner.nextInt();
        }

        크레인인형뽑기 java = new 크레인인형뽑기();
        System.out.println(java.solution(array, arr));

    }

    public int solution(int[][] array, int[] arr) {

        int answer = 0;
        // 바구니
        Stack<Integer> stack = new Stack<>();

        for (int index : arr) {
            for (int i = 0; i < array.length; i++) {

                if (array[i][index - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(array[i][index - 1]);
                    } else {
                        int lastNum = stack.peek();
                        if (lastNum == array[i][index - 1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(array[i][index - 1]);
                        }
                    }
                    array[i][index - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
