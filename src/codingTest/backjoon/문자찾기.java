package codingTest.backjoon;

import java.util.Locale;
import java.util.Scanner;

public class 문자찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine().toLowerCase();
        String input2 = scanner.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input2.equals(String.valueOf(input1.charAt(i)))) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
