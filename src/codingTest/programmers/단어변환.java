package codingTest.programmers;

import java.sql.PreparedStatement;

public class 단어변환 {

    private static int answer = 0;
    private static int[] visited;

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};

//        String begin = "hit";
//        String target = "cog";
//        String[] words = new String[]{"hot", "dot", "dog", "lot", "log"};

        단어변환 java = new 단어변환();
        System.out.println(java.solution(begin, target, words));
    }

    public int solution(String begin, String target, String[] words) {
        visited = new int[words.length];
        DFS(0, 0, begin, target, words);
        return answer;
    }

    public void DFS(int level, int checkCount, String begin, String target, String[] words) {
        if (begin.equals(target)) {
            answer = checkCount;
            return;
        } else {
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == 0) {
                    int count = 0;
                    for (char c : begin.toCharArray()) {
                        if (words[i].contains(String.valueOf(c))) {
                            count++;
                        }
                    }

                    if (count == 2) {
                        visited[i] = 1;
                        DFS(level + 1, checkCount + 1, words[i], target, words);
                        visited[i] = 0;
                    }
                }
            }

        }
    }
}
