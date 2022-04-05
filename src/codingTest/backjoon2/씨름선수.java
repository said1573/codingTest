package codingTest.backjoon2;

import java.util.*;

public class 씨름선수 {

    private static List<int[]> list = new ArrayList<>();
    private static int answer = 0;

    public static void main(String[] args) {
        씨름선수 java = new 씨름선수();
        System.out.println(java.solution());
    }

    public int solution() {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        answer = size;

        for (int i = 0; i < size; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            list.add(new int[]{height, weight});
        }

        Collections.sort(list, ((o1, o2) -> o1[0] - o2[0]));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i)[1] < list.get(j)[1]) {
                    answer--;
                    break;
                }
            }
        }

        return answer;

    }

}
