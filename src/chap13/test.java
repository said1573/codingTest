package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class test {


    public static void main(String[] args) {
        Random random = new Random();


        for(int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1));
        }
    }
}
