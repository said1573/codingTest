package codingTest.programmers;

import java.util.Arrays;

public class 양과늑대 {

    private static int sheep = 1;
    private static int wolf  = 0;

    public static void main(String[] args) {

        int[] info = new int[]{0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 4}, {0, 8}, {8, 7}, {9, 10}, {9, 11}, {4, 3}, {6, 5}, {4, 6}, {8, 9}};

        양과늑대 java = new 양과늑대();
        java.solution(info, edges);

    }

    public int solution(int[] info, int[][] edges) {

        int answer = 0;
        int startPoint = 0;

        for (int i = 0; i < edges.length -1; i++) {
            System.out.println(Arrays.toString(edges[i]));

            if (edges[i][0] == startPoint) {

            }
        }

        return answer;
    }

    public boolean checkState() {
        boolean result = true;

        if (sheep < wolf) {
            result = false;
        }

        return result;
    }
}
