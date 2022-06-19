package codingTest.test;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("1111", 1);
        map.put("0000", 2);
        map.put("8888", 3);

        System.out.println(map);
        Set<String> strings = map.keySet();
        for (String str : strings) {
            System.out.println(str);
        }


        map.put("a", map.getOrDefault("a", 0) + 1);
        System.out.println(map);

        double a = 3.123456789;
        System.out.println("첫째 자리 반 올림 : " + Math.round(a));
        System.out.println("둘째 자리 반 올림 : " + Math.round(a * 10) / 10.0);
        System.out.println("첫째 자리 올림 : " + Math.ceil(a));
        System.out.println("셋째 자리 올림 : " + Math.ceil(a * 100) / 100.0);
        System.out.println("첫째 자리 버림 : " + Math.floor(a));
        System.out.println("넷째 자리 버림 : " + Math.floor(a * 1000) / 1000.0);


    }
}
