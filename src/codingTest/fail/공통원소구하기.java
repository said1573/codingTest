package codingTest.fail;

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

        String result = String.join("", input2);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {
            if (result.contains(input1[i])) {
                list.add(Integer.valueOf(input1[i]));
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb.toString().trim());

    }
}
