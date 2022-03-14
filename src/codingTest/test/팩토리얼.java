package codingTest.test;

public class 팩토리얼 {

    public static void main(String[] args) {

        팩토리얼 java = new 팩토리얼();
        System.out.println(java.solution(4));
    }

    public int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n - 1);
        }
    }
}
