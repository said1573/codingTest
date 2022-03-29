package codingTest.backjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        String[] input1 = scanner.nextLine().split(" ");

        // input1을 Integer형으로 변환하여 list에 담는다.
        for (int i = 0; i < input1.length; i++) {
            list.add(Integer.parseInt(input1[i]));
        }

        int b = scanner.nextInt();
        scanner.nextLine();
        String[] input2 = scanner.nextLine().split(" ");

        int[] array = new int[input2.length];

        // input2을 Integer형으로 변환하여 array에 담는다.
        for (int i = 0; i < input2.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        // 배열 정렬
        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();

        // input2을 Integer형으로 변환하여 list에 담는다.
        for (int i = 0; i < input2.length; i++) {
            if (list.contains(array[i])) {
                sb.append(array[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
