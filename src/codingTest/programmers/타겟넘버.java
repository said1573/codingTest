package codingTest.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 타겟넘버 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 1, 1, 1, 1};
        int target = 3;

//        int[] numbers = new int[]{4, 1, 2, 1};
//        int target = 4;

        타겟넘버 java = new 타겟넘버();
        System.out.println(java.solution(numbers, target));

    }

    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers);
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                answer++;
            }
        }

        return answer;
    }

    public void DFS(int level, int sum, int[] numbers) {
        if (level == numbers.length) {
            list.add(sum);
            return;
        } else {
            DFS(level + 1, sum + numbers[level], numbers);
            DFS(level + 1, sum - numbers[level], numbers);
        }
    }
}
