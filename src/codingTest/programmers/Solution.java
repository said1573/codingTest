package codingTest.programmers;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }

    public String solution(int[] numbers, String hand) {

        int leftPosition = -1;
        int rightPosition = -2;

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "00");
        map.put(2, "01");
        map.put(3, "02");
        map.put(4, "10");
        map.put(5, "11");
        map.put(6, "12");
        map.put(7, "20");
        map.put(8, "21");
        map.put(9, "22");
        map.put(-1, "30");
        map.put(0, "31");
        map.put(-2, "32");

        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {

            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftPosition = number;
                continue;

            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightPosition = number;
                continue;

            } else {
                System.out.println("number : " + number);
                String leftValue = map.get(leftPosition);
                String rightValue = map.get(rightPosition);
                String numValue = map.get(number);
                System.out.println("leftPosition : " + leftPosition);
                System.out.println("rightPosition : " + rightPosition);
                System.out.println("leftValue : " + leftValue);
                System.out.println("rightValue : " + rightValue);
                System.out.println("numValue : " + numValue);

                int leftDistence =
                        Math.abs(Integer.parseInt(String.valueOf(numValue.charAt(0))) -
                                Integer.parseInt(String.valueOf(leftValue.charAt(0)))) +

                                Math.abs(Integer.parseInt(String.valueOf(numValue.charAt(1))) -
                                        Integer.parseInt(String.valueOf(leftValue.charAt(1))));

                int rightDistence =
                        Math.abs(Integer.parseInt(String.valueOf(numValue.charAt(0))) -
                                Integer.parseInt(String.valueOf(rightValue.charAt(0)))) +

                                Math.abs(Integer.parseInt(String.valueOf(numValue.charAt(1))) -
                                        Integer.parseInt(String.valueOf(rightValue.charAt(1))));

                System.out.println("leftDistence : " + leftDistence);
                System.out.println("rightDistence : " + rightDistence);
                System.out.println();

                if (hand.equals("right")) {
                    if (leftDistence >= rightDistence) {
                        sb.append("R");
                        rightPosition = number;
                    } else {
                        sb.append("L");
                        leftPosition = number;
                    }
                } else {
                    if (rightDistence >= leftDistence) {
                        sb.append("L");
                        leftPosition = number;
                    } else {
                        sb.append("R");
                        rightPosition = number;
                    }
                }

            }

        }

        return sb.toString();
    }
}