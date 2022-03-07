package codingTest.backjoon;

import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] array = new String[count];

        System.out.println("!!! : " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("i : " + i);
            String input = scanner.nextLine();
            array[i] = change(input);

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    public static String change(String sentence) {
        String result = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            result += String.valueOf(sentence.charAt(i));
        }

        return result;
    }
}
