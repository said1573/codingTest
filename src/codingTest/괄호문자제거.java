package codingTest;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        while (sentence.contains("(")) {
            sentence = sentence.replaceAll("\\(\\w+\\)", "");
        }

        System.out.println(sentence);

    }
}
