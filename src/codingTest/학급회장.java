package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 학급회장 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String input = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String key = String.valueOf(input.charAt(i));
            try {
                map.put(key, map.get(key) + 1);
            } catch (Exception e) {
                map.put(key, 1);
            }
        }

        String answer = "";
        int count = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (count < value) {
                count = value;
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
