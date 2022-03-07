package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count1 = scanner.nextInt();
        scanner.nextLine();

        String[] input1 = scanner.nextLine().split(" ");

        int count2 = scanner.nextInt();
        scanner.nextLine();

        String[] input2 = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            list.add(Integer.parseInt(input1[i]));
        }

        for (int i = 0; i < input2.length; i++) {
            list.add(Integer.parseInt(input2[i]));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
