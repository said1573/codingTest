package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 문자열압축 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {

            String word = String.valueOf(sentence.charAt(i));

            if (stack.isEmpty()) {
                stack.push(word);
            } else if (stack.peek().equals(word)) {
                stack.push(word);
            } else {
                sb.append(stack.peek());
                if (stack.size() >= 2) {
                    sb.append(stack.size());
                }
                stack.clear();
                stack.push(word);
            }
        }

        if (stack.size() > 0) {
            sb.append(stack.peek());
            if (stack.size() >= 2) {
                sb.append(stack.size());
            }
        }

        System.out.println(sb.toString());
    }
}
