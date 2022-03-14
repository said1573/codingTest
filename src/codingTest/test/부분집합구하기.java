package codingTest.test;

public class 부분집합구하기 {

    private static int n;
    private static int[] visited;

    public static void main(String[] args) {

        n = 3;
        visited = new int[n + 1];

        부분집합구하기 java = new 부분집합구하기();
        java.DFS(1);

    }

    public void DFS(int L) {
        if (L == n + 1) {
            System.out.println();
            return;
        } else {
            visited[L] = 1;
            DFS(L + 1);
            visited[L] = 0;
            DFS(L + 1);
        }
    }
}
