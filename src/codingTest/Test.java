package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Test {

    public static void main(String[] args) {

        System.out.println();
        int count = 0;
        while(true) {
            ++count;
            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int i = 0; i < 6; i++) {
                arrayList.add((int)(Math.random() * 45) + 1);
            }

            Collections.sort(arrayList);
            System.out.println(arrayList);

            if(count == 5) {
                break;
            }
        }
    }
}
