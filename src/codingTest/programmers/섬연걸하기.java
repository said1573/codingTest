package codingTest.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 섬연걸하기 {

    private static int[] visited;

    public int solution(int n, int[][] costs) {

        int answer = 0;

        visited = new int[n];

        Arrays.sort(costs, ((o1, o2) -> o1[2] - o2[2]));

        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            int x = costs[i][0];
            int y = costs[i][1];
            int value = costs[i][2];

            if (visited[x] == 0 || visited[y] == 0) {
                visited[x] = 1;
                visited[y] = 1;
                sum += value;
            }

            long count = Arrays.stream(visited).filter(o -> o == 1).count();
            System.out.println("visited : " + Arrays.toString(visited));
            if (count <= 0) {
                break;
            }
        }

        answer = sum;
        System.out.println(Arrays.deepToString(costs));
        System.out.println("answer : " + answer);
        return answer;
    }

    public static void main(String[] args) {

        섬연걸하기 java = new 섬연걸하기();
        java.solution(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}});
    }
}
