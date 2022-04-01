package codingTest.backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int size = Integer.parseInt(input1[0]);

        String[] input2 = scanner.nextLine().split(" ");
        int[] array = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }
        LRU lru = new LRU();
        lru.solution(size, array);
    }

    public void solution(int size, int[] array) {
        int[] cache = new int[size];
        for (int x : array) {
            int position = -1;
            for (int i = 0; i < size; i++) {
                if (cache[i] == x) {
                    position = i;
                }
            }

            if (position == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = position; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cache) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
