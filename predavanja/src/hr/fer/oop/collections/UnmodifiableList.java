package hr.fer.oop.collections;

import java.util.Arrays;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3); // lista nepromjenjive velicine, no svejedno je moguce promjeniti elemente u njoj
        //list.add(2);
        list.set(0, 2);

        List<Integer> newList = List.of(1, 2, 3); // nepromjenjiva lista!
        //newList.set(0, 1);
        //newList.add(2);
    }
}
