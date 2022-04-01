package codingTest.programmers;

import java.util.Arrays;

public class 가장긴팰린드롬 {
    public static void main(String[] args) {
        가장긴팰린드롬 java = new 가장긴팰린드롬();
        java.solution("abcdcbaa");
    }

    public int solution(String s) {
        int answer = 0;

        for (int startIndex = s.length() - 1; startIndex >= 0; startIndex--) {
            StringBuilder sb = new StringBuilder();
            for (int i = startIndex; i >= 0; i--) {
                sb.append(s.charAt(i));
            }

            System.out.println(sb.toString());

            if (isPalendrome(sb.toString())) {
                answer = startIndex + 1;
                break;
            }

        }
        System.out.println("answer : " + answer);
        return answer;
    }

    public boolean isPalendrome(String str) {
        boolean result = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
