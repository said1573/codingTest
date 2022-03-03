package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들의 무시합니다.

입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
found7, time: study; Yduts; emit, 7Dnuof

출력
YES
 */
public class 유효한팰린드롬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();

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

        if (stringBuilder.toString().equals(sentence)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
