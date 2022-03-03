package codingTest;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] array = sentence.split(" ");

        String answer = "";
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            if (length < array[i].length()) {
                length = array[i].length();
                answer = array[i];
            }
        }

        System.out.println(answer);
    }
}
