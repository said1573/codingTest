package codingTest.test;

import java.util.*;

public class 원더랜드 {

    private static List<Edge> list = new ArrayList<>();
    private static int[] unf;
    private static int answer = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = scanner.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < size; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();

            list.add(new Edge(v1, v2, cost));
        }

        Collections.sort(list, (o1, o2) -> o1.cost - o2.cost);

        원더랜드 java = new 원더랜드();
        System.out.println(java.solution());
    }

    public int solution() {
        for (Edge edge : list) {
            int fa = find(edge.v1);
            int fb = find(edge.v2);

            if (fa != fb) {
                answer += edge.cost;
                union(edge.v1, edge.v2);
            }
        }

        return answer;
    }

    public int find(int v) {
        if (v == unf[v]){
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }
}

class Edge {
    int v1;
    int v2;
    int cost;

    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
}