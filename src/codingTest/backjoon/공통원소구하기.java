package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        String[] input1 = scanner.nextLine().split(" ");

        int b = scanner.nextInt();
        scanner.nextLine();
        String[] input2 = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {
            int num = Integer.parseInt(input1[i]);
            list.add(num);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < input2.length; i++) {
            int num = Integer.parseInt(input2[i]);
            if (list.contains(num)) {
                answer.add(num);
            }
        }

        Collections.sort(answer);

        System.out.println(answer);
    }
}
