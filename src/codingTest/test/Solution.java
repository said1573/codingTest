package codingTest.test;

import java.util.Arrays;

class Solution {


    private static int answer = 0;
    private static int maxCount; // k개 이상
    private static int maxSum;   // 선택한 보험의 최대금액

    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 3, 8, 1};
        int k = 3;
        int t = 11;

        Solution solution = new Solution();
        System.out.println(solution.solution(arr, k, t));
    }

    public int solution(int[] arr, int k, int t) {

        maxCount = k;
        maxSum = t;
        Arrays.sort(arr);

        DFS(0, 0, 0, arr);

        return answer;
    }

    public void DFS(int level, int sum, int count, int[] arr) {

        if (level == arr.length) {
            if (sum <= maxSum) {
                if (count >= maxCount) {
                    answer++;
                }
            }

            return;
        } else {
            DFS(level + 1, sum + arr[level], count + 1, arr);
            DFS(level + 1, sum, count, arr);
        }
    }
}