package hr.fer.oop.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Test", 2);
        map.put("test", 3);

        for (Integer value : map.values())
            System.out.println(value);

        map.put("Test", 4);

        for (Integer value : map.values())
            System.out.println(value);
    }
}
