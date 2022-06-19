package codingTest.backjoon;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class k번째큰수 {

    public static void main(String[] args) {

        int answer = -1;

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int z = j + 1; z < array.length; z++) {
                    treeSet.add(array[i] + array[j] + array[z]);
                }
            }
        }

        int count = 0;
        for (int num : treeSet) {
            count += 1;
            if (count == k) {
                System.out.println(num);
                break;
            }
        }

        System.out.println(answer);

    }

}
