package codingTest.test;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", map.getOrDefault(map.get("A"), 0) + 1);
        System.out.println(map);

        map.put("A", map.getOrDefault(map.get("A"), 0));
        System.out.println(map);

    }
}
