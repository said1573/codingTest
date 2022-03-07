package codingTest.backjoon;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String sentence = scanner.next();

        String word = "";
        String answer = "";

        for (int i = 0; i < sentence.length(); i++) {
            word += sentence.charAt(i);
            if ((i + 1) % 7 == 0 && i != 0) {
                answer += trans(word);
                word = "";
            }
        }

        System.out.println(answer);

    }

    public static char trans(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#') {
                result += 1;
            } else {
                result += 0;
            }
        }

        return (char) Integer.parseInt(result, 2);
    }
}
