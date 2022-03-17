package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int number = Integer.parseInt(input1[0]);
        int testCount = Integer.parseInt(input1[1]);

        String[] array = new String[testCount];
        for (int i = 0; i < testCount; i++) {
            String input2 = scanner.nextLine().replaceAll(" ", "");
            array[i] = input2;
        }

        멘토링 java = new 멘토링();
        System.out.println(java.solution(number, array));
    }

    public int solution(int number, String[] array) {
        int answer = 0;
        System.out.println(Arrays.toString(array));


        for (int i = 1; i <= number; i++) {
            boolean flag = true;
            for (int testCount = 0; testCount < array.length; testCount++) {
                for (int j = 1; j <= number; j++) {
                    System.out.println("i : " + array[testCount].indexOf(String.valueOf(i)));
                    System.out.println("j : " + array[testCount].indexOf(String.valueOf(j)));

                    if (i != j && (array[testCount].indexOf(String.valueOf(i)) > array[testCount].indexOf(String.valueOf(j)))) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!");
                        flag = false;
                        break;
                    }
                }

                if (flag == false) {
                    break;
                }
            }

            if (flag == true) {
                answer++;
            }
        }

        return answer;
    }
}
