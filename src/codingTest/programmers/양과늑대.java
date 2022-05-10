package codingTest.programmers;

import java.util.Arrays;

public class 양과늑대 {

    private static int[] visited;
    private static int answer = 0;

    public static void main(String[] args) {

        int[] info = new int[]{0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 4}, {0, 8}, {8, 7}, {9, 10}, {9, 11}, {4, 3}, {6, 5}, {4, 6}, {8, 9}};

        양과늑대 java = new 양과늑대();
        java.solution(info, edges);

    }

    public int solution(int[] info, int[][] edges) {

        Arrays.sort(edges, (o1, o2) -> o1[0] - o2[0]);

        visited = new int[info.length];
        visited[0] = 1;
        DFS(0, 1, 0, info, edges);
        System.out.println(Arrays.deepToString(edges));

        return answer;
    }

    public void DFS(int index, int sheep, int wolf, int[] info, int[][] edges) {

        if (sheep <= wolf) {
            answer = Math.max(sheep, answer);
            return;
        }

        for (int i = 0; i < info.length; i++) {
            if (edges[i][index] == index && visited[i] == 0) {

                visited[i] = 1;
                if (info[i] == 0) {
                    DFS(i, sheep + 1, wolf, info, edges);
                } else {
                    DFS(i, sheep, wolf + 1, info, edges);
                }
                visited[i] = 0;

            }
        }
    }

}
