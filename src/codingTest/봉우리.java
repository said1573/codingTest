package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 봉우리 {

    private static List<int[]> list = new ArrayList<>();
    private static int answer = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        list.add(new int[count + 2]);
        for (int i = 0; i < count; i++) {
            String[] temp = scanner.nextLine().trim().split(" ");

            int[] array = new int[temp.length + 2];
            for (int j = 1; j < array.length - 1; j++) {
                array[j] = Integer.parseInt(temp[j - 1]);
            }

            list.add(array);
        }
        list.add(new int[count + 2]);

        checkCount();
    }

    public static void checkCount() {
        for (int i = 1; i < list.size() - 1; i++) {
            for (int j = 1; j < list.get(j).length - 1; j++) {
                int checkPoint = list.get(i)[j];
                if (checkPoint > list.get(i + 1)[j] && checkPoint > list.get(i - 1)[j] && checkPoint > list.get(i)[j - 1] && checkPoint > list.get(i)[j + 1]) {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}
