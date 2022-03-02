package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 수식최대화 {

    private static List<String> list = new ArrayList<>();

    private static boolean[] select;
    private static int[] src;
    private static int[] tgt;

    private static int answer = 0;

    public static void main(String[] args) {

        String expression = "100-200*300-500+20";

        수식최대화 java = new 수식최대화();
        java.solution(expression);

    }

    public long solution(String expression) {

        // 수식 모으기
        for (int i = 0; i < expression.length(); i++) {
            String word = String.valueOf(expression.charAt(i));

            if (word.equals("+") || word.equals("-") || word.equals("*")) {
                if (!list.contains(word)) {
                    list.add(word);
                }
            }
        }

        select = new boolean[list.size()];

        src = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            src[i] = i;
        }

        tgt = new int[list.size()];

        // 수식 우선순위 산정
        permutations(0, expression);

        return Math.abs(answer);
    }

    public static void permutations(int tgtIndex, String expression) {
        if (tgtIndex == tgt.length) {
            System.out.println(Arrays.toString(tgt));
            maxScore(tgt, expression);
            System.out.println();
            return;
        }

        for (int i = 0; i < src.length; i++) {
            if (!select[i]) {
                tgt[tgtIndex] = src[i];

                select[i] = true;
                permutations(tgtIndex + 1, expression);
                select[i] = false;
            }
        }
    }

    // 우선순위로 최대값 계산
    public static void maxScore(int[] tgt, String expression) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);

            for (int j = 0; j < expression.length(); j++) {

            }

        }

        answer = Integer.parseInt(expression);

    }

}
