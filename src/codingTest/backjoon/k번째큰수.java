package codingTest.backjoon;

import java.util.*;

public class k번째큰수 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().trim().split(" ");
//        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        String[] input2 = scanner.nextLine().trim().split(" ");

        int[] array = new int[input2.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
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
        for (int answer : treeSet) {
            count += 1;
            if (count == k) {
                System.out.println(answer);
                break;
            }
        }

    }

}
