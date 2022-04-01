package codingTest.backjoon2;

import java.util.Scanner;

public class 교육과정설계 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        교육과정설계 java = new 교육과정설계();
        System.out.println(java.solution(input1, input2));

    }

    public String solution(String input1, String input2) {
        String answer = "YES";

        int min = -1;

        for (int i = 0; i < input1.length(); i++) {
            int index = input1.indexOf(input1.charAt(i));

            if (input2.contains(String.valueOf(input1.charAt(i)))) {
                if (min < index) {
                    min = index;
                } else {
                    answer = "NO";
                    break;
                }
            } else {
                answer = "NO";
                break;
            }
        }

        return answer;
    }
}
