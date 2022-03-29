package codingTest.backjoon;

<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> origin/master
import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
<<<<<<< HEAD

        int studentCount = Integer.parseInt(input1[0]);
=======
        int number = Integer.parseInt(input1[0]);
>>>>>>> origin/master
        int testCount = Integer.parseInt(input1[1]);

        String[] array = new String[testCount];
        for (int i = 0; i < testCount; i++) {
            String input2 = scanner.nextLine().replaceAll(" ", "");
            array[i] = input2;
        }

        멘토링 java = new 멘토링();
<<<<<<< HEAD
        System.out.println(java.solution(studentCount, testCount, array));
    }

    public int solution(int studentCount, int testCount, String[] array) {
        int result = 0;

        for (int i = 1; i <= studentCount; i++) {
            String a = String.valueOf(i);
            boolean flag = true;

            for (int z = 1; z <= studentCount; z++) {
                String b = String.valueOf(z);
                for (int j = 0; j < testCount; j++) {

                    if (i != z) {
                        System.out.println("array[" + j + "].indexOf(" + a + ") : " + array[j].indexOf(a));
                        System.out.println("array[" + j + "].indexOf(" + b + ") : " + array[j].indexOf(b));
                        if (array[j].indexOf(a) < array[j].indexOf(b)) {
                            System.out.println("flag");
                            System.out.println();
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    result++;
                }
            }
        }

        return result;
=======
        System.out.println(java.solution(number, array));
    }

    public int solution(int number, String[] array) {
        int answer = 0;
        System.out.println(Arrays.toString(array));


        for (int i = 1; i <= number; i++) {
            boolean flag = true;
            for (int testCount = 0; testCount < array.length; testCount++) {
                for (int j = 1; j <= number; j++) {
                    System.out.println("i : " + array[testCount].indexOf(String.valueOf(i)));
                    System.out.println("j : " + array[testCount].indexOf(String.valueOf(j)));

                    if (i != j && (array[testCount].indexOf(String.valueOf(i)) > array[testCount].indexOf(String.valueOf(j)))) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!");
                        flag = false;
                        break;
                    }
                }

                if (flag == false) {
                    break;
                }
            }

            if (flag == true) {
                answer++;
            }
        }

        return answer;
>>>>>>> origin/master
    }
}
