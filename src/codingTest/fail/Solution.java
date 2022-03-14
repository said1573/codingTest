package codingTest.fail;

import java.util.*;

class Solution {
    public static void main(String[] args) {

        int[] H = new int[]{3, 2, 1, 1, 3};
        Solution solution = new Solution();
        solution.solution(H);
    }

    public long[][] solution(int[] H) {

        long[][] answer = new long[3][2];

        // 높이 기준으로 수행
        for (int height = 1; height <= answer.length; height++) {
            answer[height - 1][0] = height;
            answer[height - 1][1] = checkCount(H, height);
        }

        return answer;
    }

    public int checkCount(int[] array, int height) {
        int result = 0;

        boolean[] usedIndex = new boolean[array.length];

        // 높이가 같은 사각형의 인덱스 찾기
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (height == array[i]) {
                indexList.add(i);
            }

            // 높이 이상인 원소를 찾아서 usedIndex == true로 치환
            if (height <= array[i]) {
                usedIndex[i] = true;
            }
        }

        // usedIndex에서 사용할 수 없는 인덱스는 false로 치환
        for (int i = 0; i < array.length; i++) {
            if (!indexList.contains(i)) {
                if (i + 1 < array.length && i - 1 >= 0) {
                    if (!usedIndex[i - 1] || !usedIndex[i + 1]) {
                        usedIndex[i] = false;
                    }
                }

                if (i == 0 && !usedIndex[i + 1]) {
                    usedIndex[i] = false;
                }

                if (i == array.length - 1 && !usedIndex[i - 1]) {
                    usedIndex[i] = false;
                }
            }
        }


        System.out.println(Arrays.toString(usedIndex));
        System.out.println();


        return result;
    }
}