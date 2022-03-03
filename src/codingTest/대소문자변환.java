package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] array = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {

            if (Character.isUpperCase(input.charAt(i))) {
                String word = String.valueOf(input.charAt(i)).toLowerCase();
                array[i] = word;
            } else {
                String word = String.valueOf(input.charAt(i)).toUpperCase();
                array[i] = word;
            }

        }

        System.out.println(String.join("", array));
    }
}
