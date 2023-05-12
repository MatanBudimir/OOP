package hr.fer.oop.collections;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("test");
        set.add("test");//ignored
    }
}
