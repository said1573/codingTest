package codingTest.backjoon;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] array = scanner.nextLine().split(" ");

        int score = 0;
        int collectCount = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "1":
//                    System.out.println("1 : " + array[i]);
                    score += collectCount + 1;
                    collectCount += 1;
                    break;
                case  "0":
//                    System.out.println("0 : " + array[i]);
                    collectCount = 0;
                    break;
            }
        }

        System.out.println(score);
    }
}
