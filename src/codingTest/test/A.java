package codingTest.test;

public class A {

    int a = 1000;

    public A() {
        System.out.println("가");
    }

    public A(int x) {
        System.out.println("나");
    }

    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B(1);
        System.out.println(b1.a + b2.a);
    }

}
