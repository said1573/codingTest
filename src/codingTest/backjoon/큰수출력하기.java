package codingTest.backjoon;

import java.util.Scanner;
import java.util.Stack;

public class 큰수출력하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        String sentence = scanner.nextLine();
        String[] array = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {

            int number = Integer.valueOf(array[i]);

            if (stack.isEmpty() || stack.peek() < number) {
                sb.append(number + " ");
            }

            stack.push(number);
        }


        System.out.println(sb.toString().trim());
    }
}
