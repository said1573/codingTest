package codingTest.backjoon2;

import java.util.*;



public class 원더랜드 {

    private static List<Edge> list;
    private static int[] unf;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        list = new ArrayList<>();
        unf = new int[nodeCount + 1];
        for (int i = 1; i < unf.length; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < edgeCount; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            list.add(new Edge(v1, v2, cost));
        }

        Collections.sort(list, (o1, o2) -> o2.cost - o1.cost);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).v1 + ", " + list.get(i).v2 + ", " + list.get(i).cost);
        }

        원더랜드 java = new 원더랜드();
        System.out.println(java.solution());
    }

    public int solution() {
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            Edge edge = list.get(i);
            int v1 = find(edge.v1);
            int v2 = find(edge.v2);
            int cost = edge.cost;
            if (v1 != v2) {
                answer += cost;
                union(v1, v2);
            }
        }

        System.out.println("unf : " + Arrays.toString(unf));
        return answer;
    }

    public void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public int find(int value) {
        if (value == unf[value]) {
            return value;
        } else {
            return unf[value] = find(unf[value]);
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