package codingTest.backjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        모든아나그램찾기 java = new 모든아나그램찾기();
        System.out.println(java.solution(input1, input2));

    }

    public int solution(String a, String b) {
        int answer = 0;

        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char c : b.toCharArray()) {
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        int L = b.length() - 1;

        for (int i = 0; i < L; i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;

        for (int rt = L; rt < a.length(); rt++) {
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0) + 1);

            if (aMap.equals(bMap)) {
                answer++;
            }

            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt)) - 1);

            if (aMap.get(a.charAt(lt)) == 0) {
                aMap.remove(a.charAt(lt));
            }

            lt++;
        }

        return answer;
    }
}
