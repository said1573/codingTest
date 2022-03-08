package codingTest.fail;

import java.util.*;

public class 매출액종류 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        int count = 0;

        StringBuilder sb = new StringBuilder();

        while (count < (n - k) + 1) {
            Set<String> set = new HashSet<>();
            for (int i = count; i < count + k; i++) {
                set.add(input2[i]);
            }

            sb.append(set.size() + " ");
            count += 1;
        }

        System.out.println(sb.toString().trim());
    }
}
