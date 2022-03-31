package codingTest.backjoon;

import java.util.*;

public class 후위연산식 {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('1');
        set.add('2');
//        Iterator<Character> iterator = set.iterator();

        int[] arr = new int[]{1, 2, 3, 4, 5};

        OptionalInt a = Arrays.stream(arr).min();

//        Scanner scanner = new Scanner(System.in);
//        String input1 = scanner.nextLine();
//
//        후위연산식 java = new 후위연산식();
//        System.out.println(java.solution(input1));
    }

    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);

            if (Character.isDigit(word)) {
                stack.push(word - 48);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch (word) {
                    case '+':
                        stack.push(num2 + num1);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num2 * num1);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }

        return stack.get(0);
    }
}
