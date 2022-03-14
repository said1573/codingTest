package codingTest.backjoon;

import java.util.Scanner;

public class 교육과정설계 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split("");
        String input2   = scanner.nextLine();

        String answer = "YES";
        int max = 0;

        for (int i = 0; i < input1.length; i++) {
            int index = input2.indexOf(input1[i]);
            System.out.println("index : " + index);
            System.out.println("input1[" + i + "] : " + input1[i]);

            if (!input2.contains(input1[i])) {
                answer = "NO";
                System.out.println(answer);
                return;

            } else if (max <= index) {
                max = index;

            } else {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);

    }
}
