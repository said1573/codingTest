package codingTest;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            sb.append(String.valueOf(sentence.charAt(i)));
        }

        if (sentence.equals(sb.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
