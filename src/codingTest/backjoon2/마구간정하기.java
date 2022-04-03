package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int selectCount = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        마구간정하기 java = new 마구간정하기();
        System.out.println(java.solution(array, selectCount));
    }

    public int solution(int[] array, int selectCount) {

        Arrays.sort(array);

        int answer = 0;
        int lt = 1;
        int rt = array[array.length - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(array, mid) >= selectCount) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public int count(int[] array, int count) {

        int cnt = 1;
        int endPoint = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] - endPoint >= count) {
                cnt++;
                endPoint = array[i];
            }
        }

        return cnt;
    }
}
