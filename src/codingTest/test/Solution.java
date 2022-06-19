package codingTest.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    private static int answer = 0;
    private static String num = "";

    private static long[] array;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(437674, 3);
    }

    public int solution(int n, int k) {
        num = Integer.toString(n, k);
        // System.out.println("num : " + num);
        // System.out.println();

        opo(); po(); op(); p();

        return answer;
    }

    public boolean isPrime(int num) {
        boolean result = true;

        array = new long[num + 1];
        for (int i = 2; i < num; i++) {
            if (check(i)) {
                for (int j = i + i; j < num; j = j + i) {
                    array[j] = 1; // 1 : false
                }
            }
        }
        // System.out.println("array : " + Arrays.toString(array));
        if (array[num] != 0) {
            result = false;
        }

        return result;
    }

    public boolean check(long num) {
        boolean result = true;

        for (long i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public void opo() {
        String regEx = "0[1-9]+0";
        String number = num;

        Pattern pattern = Pattern.compile(regEx);
        Matcher match = pattern.matcher(number);

        while(match.find()) {
            String result = match.group();

            result = result.replaceAll("0", "");
            // System.out.println("result : " + result);
            if (isPrime(Integer.parseInt(result)) && Integer.parseInt(result) >= 2) {
                // System.out.println("ok");
                answer++;
            }
        }


    }

    public void po() {
        String number = "";

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '0') {
                break;
            }

            number += String.valueOf(ch);
        }

        // System.out.println("po number : " + number);
        if (isPrime(Integer.parseInt(number))) {
            // System.out.println("ok");
            answer++;
        }
    }

    public void op() {
        String number = "";

        for (int i = num.length() - 1; i >= 0 ; i--) {
            char ch = num.charAt(i);
            if (ch == '0') {
                break;
            }

            number += String.valueOf(ch);
        }

        // System.out.println("op number : " + number);
        if (isPrime(Integer.parseInt(number))) {
            // System.out.println("ok");
            answer++;
        }
    }

    public void p() {
        String number = num;
        if (!number.contains("0")) {
            // System.out.println("p number : " + number);
            if (isPrime(Integer.parseInt(number))) {
                // System.out.println("ok");
                answer++;
            }
        }
    }
}