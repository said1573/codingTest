package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split("");
        String[] input2 = scanner.nextLine().split("");

        Arrays.sort(input1);
        Arrays.sort(input2);

        String result1 = String.join("", input1);
        String result2 = String.join("", input2);

        if (result1.equals(result2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
