package codingTest;

import java.util.*;

public class 특정문자뒤집기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i))) {
                stack.push(String.valueOf(sentence.charAt(i)));
            } else {
                queue.add(String.valueOf(sentence.charAt(i)));
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i))) {
                stringBuilder.append(stack.pop());
            } else {
                stringBuilder.append(queue.poll());
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
