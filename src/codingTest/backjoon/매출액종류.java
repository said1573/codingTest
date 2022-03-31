package codingTest.backjoon;

import java.util.*;

public class 매출액종류 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        매출액종류 java = new 매출액종류();
        java.solution(n, k, array);

    }

    public void solution(int n, int k, int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        // 초기값 셋팅
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < arr.length; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            System.out.println("map1 : " + map);
            list.add(map.size());
            map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
            System.out.println("map2 : " + map);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }

            lt++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
