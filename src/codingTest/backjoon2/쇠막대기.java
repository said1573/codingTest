package codingTest.backjoon2;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < input1.length(); i++) {
            char word = input1.charAt(i);

            if (word == '(') {
                stack.push(word);
            } else {
                if (input1.charAt(i - 1) == '(') {
                    stack.pop(); // 레이저 괄호 제거
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer += 1;
                }
            }

        }

        System.out.println(answer);

    }
}
