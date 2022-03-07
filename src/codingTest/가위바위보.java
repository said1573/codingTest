package codingTest;

import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        for (int i = 0; i < length; i++) {
            // 비겼을 때
            if (input1[i].equals(input2[i])) {
                System.out.println("D");
            } else if (input1[i].equals("1") && input2[i].equals("3")) {
                System.out.println("A");
            } else if (input1[i].equals("2") && input2[i].equals("1")) {
                System.out.println("A");
            } else if (input1[i].equals("3") && input2[i].equals("2")) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

    }
}
