package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 임시반장정하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String[]> list = new ArrayList<>();

        // 입력 받기 (setting)
        for (int i = 0; i < count; i++) {
            String[] array = scanner.nextLine().split(" ");
            list.add(array);
        }

        // 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i : " + Arrays.toString(list.get(i)));
        }

        String studentNumber = "";

        for (int num = 0; num < list.size(); num++) {
            int matchCount = 0;

            System.out.println("num : " + num);
            for (int matchNum = 0; matchNum < list.get(num).length; matchNum++) {

                System.out.println("matchNum : " + matchNum);
                System.out.println(list.get(num)[matchNum] + " " + list.get(matchNum)[matchNum]);
                System.out.println();
//                if (list.get(num)[matchNum] == list.get(matchNum)[matchNum]) {
//                    matchCount += 1;
//                }
            }

        }

    }
}
