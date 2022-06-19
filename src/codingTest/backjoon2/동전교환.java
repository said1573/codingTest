package codingTest.backjoon2;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] coin = new int[size];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = scanner.nextInt();
        }

        int money = scanner.nextInt();

        동전교환 java = new 동전교환();
        System.out.println(java.solution(size, coin, money));
    }

    public int solution(int size, int[] coin, int money) {

        int[] array = new int[money + 1];
        Arrays.fill(array, Integer.MAX_VALUE);
        array[0] = 0;

        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < array.length; j++) {
                array[j] = Math.min(array[j], array[j - coin[i]] + 1);
            }
        }

        return array[money];
    }

}
