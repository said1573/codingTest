package codingTest.backjoon;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                stack.push((int) input.charAt(i));
            } else {

                int right = stack.pop();
                int left = stack.pop();
                int result = 0;

//                switch (word) {
//                    case '+':
//                        result = left + right;
//                        stack.push((char) result);
//                        break;
//                    case '-':
//                        result = left - right;
//                        stack.push((char) result);
//                        break;
//                    case '*':
//                        result = left * right;
//                        stack.push((char) result);
//                        break;
//
//                    case '/':
//                        result = left / right;
//                        stack.push((char) result);
//                        break;
//                }
            }
        }

//        System.out.println(stack);
    }
}
