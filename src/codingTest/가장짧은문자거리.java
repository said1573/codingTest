package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class 가장짧은문자거리 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] array = sentence.split(" ");
        String word = array[0];
        String target = array[1];

        int[] answer = new int[word.length()];

        // 오른쪽 방향으로
        int p = 1000;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals(target)) {
                p = 0;
            } else {
                p += 1;
            }
            answer[i] = p;
        }

        // 왼쪽 방향으로
        p = 1000;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (String.valueOf(word.charAt(i)).equals(target)) {
                p = 0;
            } else {
                p += 1;
            }
            answer[i] = Math.min(p, answer[i]);
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i] + " ");
        }

        System.out.println(sb.toString().trim());

    }
}
