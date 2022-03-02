package codingTest;

import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            String word = scanner.next();
            array[i] = trans(word);
        }

        for (String s : array) {
            System.out.println(s);
        }

    }

    public static String trans(String word) {
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += String.valueOf(word.charAt(i));
        }

        return result;
    }
}
