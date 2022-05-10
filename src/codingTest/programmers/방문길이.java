package codingTest.programmers;

import java.util.HashSet;
import java.util.Set;

public class 방문길이 {

    private static Set<String> set = new HashSet<>();

    private static String[] board = new String[4];

    private static int[] dx = {0, 0, -1, 1}; // U, D, L, R
    private static int[] dy = {1, -1, 0, 0}; // U, D, L, R
    private static int[] position = {0, 0};

    public static void main(String[] args) {

//        String dirs = "ULURRDLLU"; // 7
        String dirs = "LULLLLLLU"; // 7
        방문길이 java = new 방문길이();
        java.solution(dirs);
    }


    public int solution(String dirs) {

        int nextX = 0;
        int nextY = 0;

        for (char dir : dirs.toCharArray()) {

            switch(dir) {
                case 'U': // 반전
                    nextX = position[0] + dx[0];
                    nextY = position[1] + dy[0];

                    if (nextX >= -5 && nextX <= 5 && nextY >= -5 && nextY <= 5) {
                        board[0] = String.valueOf(nextX);
                        board[1] = String.valueOf(nextY);
                        board[2] = String.valueOf(position[0]);
                        board[3] = String.valueOf(position[1]);

                        position[0] = nextX;
                        position[1] = nextY;

                        System.out.println(String.join("", board));
                        set.add(String.join("", board));
                    }

                    break;

                case 'D':
                    nextX = position[0] + dx[1];
                    nextY = position[1] + dy[1];

                    if (nextX >= -5 && nextX <= 5 && nextY >= -5 && nextY <= 5) {
                        board[0] = String.valueOf(position[0]);
                        board[1] = String.valueOf(position[1]);
                        board[2] = String.valueOf(nextX);
                        board[3] = String.valueOf(nextY);

                        position[0] = nextX;
                        position[1] = nextY;

                        System.out.println(String.join("", board));
                        set.add(String.join("", board));
                    }

                    break;

                case 'L':
                    nextX = position[0] + dx[2];
                    nextY = position[1] + dy[2];

                    if (nextX >= -5 && nextX <= 5 && nextY >= -5 && nextY <= 5) {
                        board[0] = String.valueOf(position[0]);
                        board[1] = String.valueOf(position[1]);
                        board[2] = String.valueOf(nextX);
                        board[3] = String.valueOf(nextY);

                        position[0] = nextX;
                        position[1] = nextY;

                        System.out.println(String.join("", board));
                        set.add(String.join("", board));
                    }

                    break;

                case 'R': // 반전
                    nextX = position[0] + dx[3];
                    nextY = position[1] + dy[3];

                    if (nextX >= -5 && nextX <= 5 && nextY >= -5 && nextY <= 5) {
                        board[0] = String.valueOf(nextX);
                        board[1] = String.valueOf(nextY);
                        board[2] = String.valueOf(position[0]);
                        board[3] = String.valueOf(position[1]);

                        position[0] = nextX;
                        position[1] = nextY;

                        System.out.println(String.join("", board));
                        set.add(String.join("", board));
                    }

                    break;
            }

        }

        System.out.println("set  : " + set);
        System.out.println("answer  : " + set.size());
        return set.size();
    }
}
