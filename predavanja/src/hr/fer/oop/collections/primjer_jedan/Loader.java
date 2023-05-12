package hr.fer.oop.collections.primjer_jedan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        double treshold = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < 0)
                continue;
            nums.add(num);
            treshold += num;
        }

        treshold /= nums.size();

        Predicate<Number> predicate = new BelowTreshold(treshold);

        nums.removeIf(predicate);

        //easier
        //nums.removeIf((i) -> i < 0);

        Collections.sort(nums);

        for (int i : nums)
            System.out.println(i);
    }
}
