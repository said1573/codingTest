package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 격자판최대합 {

    private static int max = 0;
    private static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < length; i++) {
            String[] array = scanner.nextLine().trim().split(" ");

            // 형변환
            int[] temp = new int[array.length];
            for (int j = 0; j < array.length; j++) {
                temp[j] = Integer.parseInt(array[j]);
            }

            list.add(temp);
        }

        maxRow(); maxCol(); maxDiagonal();

        System.out.println(max);

    }

    public static void maxRow() {
        for (int i = 0; i < list.size(); i++) {
            int sum = Arrays.stream(list.get(i)).sum();
            if (max < sum ) {
                max = sum;
            }
        }
    }

    public static void maxCol() {
        for (int i = 0; i < list.size(); i++) {

            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j)[i];
            }

            if (max < sum ) {
                max = sum;
            }
        }
    }

    public static void maxDiagonal() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i)[i];
        }

        if (max < sum ) {
            max = sum;
        }

        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get((list.size() - 1) - i)[i];
        }

        if (max < sum ) {
            max = sum;
        }
    }
}
