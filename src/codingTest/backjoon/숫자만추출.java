package codingTest.backjoon;

import java.util.Scanner;

public class 숫자만추출 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                result += sentence.charAt(i);
            }
        }

        System.out.println(Integer.parseInt(result));
    }
}
