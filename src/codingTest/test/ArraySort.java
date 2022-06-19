package codingTest.test;

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {

        ArraySort arraySort = new ArraySort();
        arraySort.solution(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 5);

    }

    public int[] solution(int[] stages, int N) {
        int[] answer = new int[N];

        double[] result = new double[N];

        for (int i = 0; i < N; i++) {

            int stageLevel = i + 1;
            int failCount = 0;
            int successCount = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= stageLevel) {
                    successCount += 1;
                }

                if (stages[j] == stageLevel) {
                    failCount += 1;
                }
            }

            result[i] = failCount / (double) successCount;

        }

        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        for (int i = 0; i < result.length; i++) {
            treeMap.put(i + 1, result[i]);
        }

        System.out.println("!!! : " + treeMap);
        return answer;
    }
}
