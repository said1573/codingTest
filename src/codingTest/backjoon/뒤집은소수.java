package codingTest.backjoon;

import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] array = scanner.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {

            int result = isPrime(array[i]);
            if (result >= 2) {
                sb.append(result + " ");
            }

        }

        System.out.println(sb.toString().trim());
    }

    public static int isPrime(String number) {
        boolean result = true;

        String temp = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            temp += number.charAt(i);
        }

        int num = Integer.valueOf(temp);
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }

        if (result == true) {
            return num;
        } else {
            return 0;
        }

    }

}
