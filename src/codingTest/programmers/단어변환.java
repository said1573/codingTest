package codingTest.programmers;

public class 단어변환 {

    private static int answer = 0;

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
        DFS(0, begin, target, words);
        return answer;
    }

    public void DFS(int level, String begin, String target, String[] words) {

        if (words[level].equals(target)) {
            return;
        } else {
            int count = 0;
            for (int i = 0; i < begin.length(); i++) {
                if (words[level].charAt(i) != begin.charAt(i)) {
                    count++;
                }
            }

            if (count == 1) {
                answer++;
                DFS(level + 1, begin, target, words);
                DFS(level + 1, begin, target, words);
            }

        }
    }
}
