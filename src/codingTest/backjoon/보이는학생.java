package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] array = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int height = Integer.parseInt(array[i]);

            if (list.size() <= 0 || Collections.max(list) < height) {
                list.add(height);
            }
        }

        System.out.println(list.size());
    }
}
