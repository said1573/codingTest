package codingTest.backjoon2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 피자배달거리 {

    private static Queue<Position> house = new LinkedList<>();
    private static Queue<Position> pizza = new LinkedList<>();

    public static void main(String[] args) {

        피자배달거리 java = new 피자배달거리();
        System.out.println(java.solution());

    }

    public int solution() {
        int answer = 0;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int pizzaCount = scanner.nextInt();

        int[][] array = new int[size][size];
        int[][] board = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] == 1) {
                    house.offer(new Position(i, j));
                } else if (array[i][j] == 2) {
                    pizza.offer(new Position(i, j));
                }

                board[i][j] = Integer.MAX_VALUE;
            }
        }

        int houseSize = house.size();
        int pizzaSize = pizza.size();
        for (int i = 0; i < pizzaSize; i++) {
            Position pizzaPosition = pizza.poll();
            for (int j = 0; j < houseSize; j++) {
                Position hosuePostion = house.poll();

                int distance = Math.abs(pizzaPosition.x - hosuePostion.x) + Math.abs(pizzaPosition.y - hosuePostion.y);
                board[hosuePostion.x][hosuePostion.y] = Math.min(board[hosuePostion.x][hosuePostion.y], distance);
                house.offer(hosuePostion);
            }

        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] < 102) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }

    class Position {
        int x;
        int y;

        Position (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
