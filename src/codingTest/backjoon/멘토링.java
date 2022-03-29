package codingTest.backjoon;

import java.util.Arrays;

import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");


        int studentCount = Integer.parseInt(input1[0]);

        int number = Integer.parseInt(input1[0]);

        int testCount = Integer.parseInt(input1[1]);

        String[] array = new String[testCount];
        for (int i = 0; i < testCount; i++) {
            String input2 = scanner.nextLine().replaceAll(" ", "");
            array[i] = input2;
        }

        멘토링 java = new 멘토링();

        System.out.println(java.solution(studentCount, testCount, array));
    }

    public int solution(int studentCount, int testCount, String[] array) {
        int result = 0;

        for (int i = 1; i <= studentCount; i++) {
            String a = String.valueOf(i);
            boolean flag = true;

            for (int z = 1; z <= studentCount; z++) {
                String b = String.valueOf(z);
                for (int j = 0; j < testCount; j++) {

                    if (i != z) {
                        System.out.println("array[" + j + "].indexOf(" + a + ") : " + array[j].indexOf(a));
                        System.out.println("array[" + j + "].indexOf(" + b + ") : " + array[j].indexOf(b));
                        if (array[j].indexOf(a) < array[j].indexOf(b)) {
                            System.out.println("flag");
                            System.out.println();
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    result++;
                }
            }
        }

        return result;

    }
}
