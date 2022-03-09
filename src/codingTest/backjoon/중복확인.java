package codingTest.backjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 중복확인 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> set = new HashSet<>();

        int[] array = new int[length];
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
            set.add(array[i]);
        }

        if (set.size() != array.length) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }

    }
}
