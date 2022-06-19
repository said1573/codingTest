package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;
//문제
//양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

//입력
//첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.

//출력
//첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.
public class 약수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        약수 java = new 약수();
        java.solution(size, array);

    }

    public void solution(int size, int[] array) {

        if (array[0] % 2 == 0) {
            even(array);
        } else {
            odd(array);
        }

    }

    private void odd(int[] array) {
        if (array.length == 1) {
            System.out.println(array[0] * array[0]);
        } else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }

                if (max < array[i]) {
                    max = array[i];
                }
            }

            System.out.println(min * max);
        }
    }

    private void even(int[] array) {
        int num = Arrays.stream(array).max().getAsInt();
        System.out.println(num * 2);
    }

}
