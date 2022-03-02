package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 중복문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            String word = String.valueOf(sentence.charAt(i));

            if (!list.contains(word)) {
                list.add(word);
            }

        }

        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        System.out.println(answer);
    }
}
