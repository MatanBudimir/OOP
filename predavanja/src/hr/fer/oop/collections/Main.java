package hr.fer.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 100; i++)
            numbers.add(i);

        System.out.println(numbers.size());

        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 1000; i++)
            nums.add(i);

        System.out.println(nums.get(750));
    }
}
