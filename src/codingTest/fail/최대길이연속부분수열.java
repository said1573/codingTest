package codingTest.fail;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int count  = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        최대길이연속부분수열 java = new 최대길이연속부분수열();
        System.out.println(java.solution(length, count, array));
    }

    public int solution(int length, int count, int[] array) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < array.length; rt++) {
            if (array[rt] == 0) {
                cnt++;
            }

            while (cnt > count) {
                if (array[lt] == 0) {
                    cnt--;
                }

                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
